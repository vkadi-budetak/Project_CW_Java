import java.security.Key;

// Параметризованный класс с двумя параметрами типа:
// K (Key) - ключ
// V (Value) - значение
public class Pair<K, V> {
    private  final K key;
    private  final V value;


    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key = " + key +
                ", value = " + value +
                '}';
    }
    // Параметризованные метод с НЕСКОЛЬКИМИ параметрами типа
    // <K, V> обьявляет, что метод обобщенный с двумя параметрами K и V
    // Pair<K, V> - возвращаемый параметризованный тип, использующий эти же K и V
    public  static <K, V> Pair<K, V> of(K key, V value) {
        System.out.println("Создание пары с типами: " + key.getClass().getSimpleName() + " и " +
                value.getClass().getSimpleName());
        return new Pair<>(key, value);
    }
}
