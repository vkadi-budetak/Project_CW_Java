public class Main_Масиви {
    public static void main(String[] args) {
        /// Використання ->> МАСИВІВ

        String[] fruits = {"Orange", "Banana", "Apple", "Lemon", "Apricot"};
        // iteration with for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("МАСИВ => " + fruits[i]);
        }

        // iteration with for-each loop
        for (String fruit : fruits) {
            System.out.println("for-each => "+ fruit);
        }
        // break
        for (String fruit : fruits) {
            if (fruit.startsWith("A")) {
                System.out.println(fruit);
                break; // негайне припинення циклу
            }
        }
        // continue
        for (String fruit : fruits) {
            if (fruit.startsWith("A")) {
                continue; // негайне припинення поточної ітерації тільки
            }
            System.out.println(fruit);
        }
    }
}
