import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HashMapImpl<V> implements HashMap<String, V> {
    private static final int table_size = 300007;
    private static final int A = 31;

    private final ArrayList<LinkedList<Entry<String, V>>> table;

    public HashMapImpl(){
        table = new ArrayList<>(table_size);
        for (int i = 0; i < table_size; i++);{
            table.add(null);
        }
    }

    private long hashString(String value){
        long hash = 0;
        for (Character ch : value.toCharArray()){
            hash = (hash * A + ch) % table_size;
        }
        return hash;
    }

    @Override
    public void put(String key, V value){
        int index = (int) hashString(key);
        LinkedList<Entry<String, V>> bucket = table.get(index);

        if (bucket == null){
            bucket= new LinkedList<>();
            table.set(index, bucket);
        }

        for (Entry<String, V> entry : bucket){
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }

    @Override
    public V getValue(String key){
        int index = (int) hashString(key);
        LinkedList<Entry<String, V>> bucket = table.get(index);

        if ( bucket == null){
            return null;
        }

        for (Entry<String, V> entry : bucket){
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public V delete(String key){
        int index = (int) hashString(key);
        LinkedList<Entry<String, V>> bucket = table.get(index);

        if (bucket == null){
            return null;
        }

        Iterator<Entry<String, V>> iterator = bucket.iterator();

        while (iterator.hasNext()){
            Entry<String, V> entry = iterator.next();
            if (entry.getKey().equals(key)){
                V removedValue = entry.getValue();
                iterator.remove();
                return removedValue;
            }
        }
        return null;
    }
}
