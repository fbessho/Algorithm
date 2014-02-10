import com.gs.collections.impl.list.mutable.FastList;
import com.gs.collections.impl.test.Verify;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nat on 14/01/29.
 */
public class BinarySearchTreeTest
{
    @Test
    public void insertAndSearch()
    {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(13);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(6);
        tree.insert(21);
        tree.insert(15);

        Assert.assertNotNull(tree.search(13));
        Assert.assertNotNull(tree.search(7));
        Assert.assertNull(tree.search(22));

        tree.delete(13);
        Assert.assertNull(tree.search(13));
        Assert.assertNotNull(tree.search(7));
    }

    @Test
    public void insertAndSearch2()
    {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(9);
        Verify.assertListsEqual(FastList.newListWith(1, 2, 3, 4, 5, 6, 9), tree.sorted());

        tree.delete(2);
        Verify.assertListsEqual(FastList.newListWith(1, 3, 4, 5, 6, 9), tree.sorted());
    }
}
