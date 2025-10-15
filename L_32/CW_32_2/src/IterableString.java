import java.util.Iterator;

public class IterableString  implements Iterable<String>{
private String text;

    public IterableString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public Iterator<String> iterator() {
        // Реализация через анонимный клас
        return new Iterator<String>() {
            private String[] words = text.split(" ");
            int currenrIndex = 0;

            @Override
            public boolean hasNext() {
                return currenrIndex < words.length;
            }

            @Override
            public String next() {
                return words[currenrIndex++];
            }
        };
    }
}

/**
 * Создайте класс IterableString, в нем должно быть поле-строка с текстом.
 * Сделайте этот класс Iterable и реализуйте итератор таким образом,
 * что бы метод next возвращал очередное слово в строке текста.
 * В рамках данной задачи слова в тексте разделены одним пробелом
 * и строке не содержит знаков препинания.
 */
