package generics;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {

        Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<>("hello", "world");

        System.out.println(p1.getValue());
        System.out.println(p2.getKey());

    }

}
