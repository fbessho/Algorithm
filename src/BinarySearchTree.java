import com.gs.collections.impl.list.mutable.FastList;

import java.util.List;

/**
 * Created by nat on 14/01/29.
 */
public class BinarySearchTree<K> implements SearchTree<K>
{
    private BinaryTreeNode<K> root;


    public void insert(K key)
    {
        if (this.root == null)
        {
            this.root = new BinaryTreeNode<K>(key);
            return;
        }

        BinaryTreeNode<K> currentNode = this.root;
        while (!currentNode.getKey().equals(key))
        {
            if (keyLessThan(key, currentNode.getKey()))
            {
                final BinaryTreeNode<K> nextNode = currentNode.getLeft();
                if (nextNode == null)
                {
                    currentNode.setLeft(new BinaryTreeNode<K>(key));
                    return;
                }
                currentNode = nextNode;
            }
            else
            {
                final BinaryTreeNode<K> nextNode = currentNode.getRight();
                if (nextNode == null)
                {
                    currentNode.setRight(new BinaryTreeNode<K>(key));
                    return;
                }
                currentNode = nextNode;
            }
        }
        throw new RuntimeException("key " + key + " has already been registered.");
    }

    @Override
    public boolean keyLessThan(K key, K other)
    {
        if (key instanceof Integer && other instanceof Integer)
        {
            return ((Integer) key).compareTo((Integer) other) < 0;
        }
        throw new RuntimeException("Unsupported key type: " + key.getClass().getName() + other.getClass().getName());
    }

    @Override
    public Node search(K key)
    {
        BinaryTreeNode<K> currentNode = this.root;
        while (currentNode != null)
        {
            if (currentNode.getKey().equals(key))
            {
                return currentNode;
            }
            else if (keyLessThan(key, currentNode.getKey()))
            {
                currentNode = currentNode.getLeft();
            }
            else
            {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    @Override
    public void delete(K key)
    {
        this.root = delete(this.root, key);
    }

    @Override
    public List<K> sorted()
    {
        return sorted(this.root);
    }

    private List<K> sorted(BinaryTreeNode<K> node)
    {
        if(node==null)
        {
            return FastList.<K>newList();
        }
        List<K> sortedList = sorted(node.getLeft());
        sortedList.add(node.getKey());
        sortedList.addAll(sorted(node.getRight()));
        return sortedList;
    }

    private BinaryTreeNode<K> delete(BinaryTreeNode<K> node, K key)
    {
        if(node==null)
        {
            return null;
        }

        if(node.getKey().equals(key))
        {
            if(node.getRight()==null)
            {
                return node.getLeft();
            }
            else if(node.getLeft()==null)
            {
                return node.getRight();
            }
            else
            {
                BinaryTreeNode<K> smallestInRightSubTree = smallest(node.getRight());
                BinaryTreeNode<K> rightSubTree = delete(node.getRight(), smallestInRightSubTree.getKey());
                smallestInRightSubTree.setRight(rightSubTree);
                smallestInRightSubTree.setLeft(node.getLeft());
                return smallestInRightSubTree;
            }
        }
        else if(keyLessThan(key, node.getKey()))
        {
            node.setLeft(delete(node.getLeft(), key));
            return node;
        }
        else
        {
            node.setRight(delete(node.getRight(), key));
            return node;
        }
    }

    private BinaryTreeNode<K> smallest(BinaryTreeNode<K> node)
    {
        if(node.getLeft()==null)
        {
            return node;
        }
        return smallest(node.getLeft());
    }

    public class BinaryTreeNode<K> implements Node<K>
    {
        private BinaryTreeNode<K> left;
        private BinaryTreeNode<K> right;
        private K label;

        public BinaryTreeNode(K label)
        {
            this.label = label;
        }

        public BinaryTreeNode<K> getLeft()
        {
            return left;
        }

        public void setLeft(BinaryTreeNode<K> left)
        {
            this.left = left;
        }

        public BinaryTreeNode<K> getRight()
        {
            return right;
        }

        public void setRight(BinaryTreeNode<K> right)
        {
            this.right = right;
        }

        @Override
        public K getKey()
        {
            return label;
        }
    }
}
