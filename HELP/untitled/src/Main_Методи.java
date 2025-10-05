public class Main_Методи {
    public static void main(String[] args) {
        /// Використання ->> МЕТОДИ
        //Varargs
        int sum1 = getSum(10, 20,30); //int... ми можемо передавати скільки хочемо параметрів
        System.out.println(sum1);



    }



    /// Використання ->> МЕТОДИ
    //Varargs
    public static int getSum(int... numbers){ // рахуємо суму переданих чисел
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}
