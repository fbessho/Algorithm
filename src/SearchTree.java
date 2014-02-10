import java.util.List;

/**
 * Created by nat on 14/02/04.
 */
public interface SearchTree<K>
{
    void insert(K key);

    boolean keyLessThan(K key, K other);

    Node search(K key);
    void delete(K key);

    List<K> sorted();
}
