public class Example_Массивы_ArrayList_List {

    //МАССИВЫ
// String[] names=new String[5];// создали исходный массив на 5 элементов
// Sy stem.out.println(Arrays.toString(names)); // проверили что в нем по умолчанию

// System.lineSeparator() - универсальный разделитель строк - аналог \n

// return (int) (min + Math.random() * (max - min + 1)) /// ПОЛУЧИТЬ СЛУЧАЙНОЕ ЧИСЛО

// int first = number/1000; // при / 1000 мы откажимся от 3 последних цыфр
// int last = number%1000; // 123456 / 1000 = 123;    123456 % 1000 = 456;int

/**
 * Рассматриваем МАССИВ строк и перебираем его
 *
 * xc arStr = {"str1", "str2", "str3"};
 * //Перебираем и добираемся к элементу
 *         for (int i = 0; i < arStr.length; i++) {
 *         System.out.print(arStr[i] + " | ");
 *         }
 *                 System.out.println();
 *
 * //или через for-each
 *         for (String s : arStr) {
 *         System.out.print(s + " ! ");
 *         }
 *                 System.out.println();
 */

/**
 * КОЛЕКЦИИ - ArrayList (Iterator() next, hasNext, remove)
 *
 * ArrayList<String> listStr = new ArrayList<>(Arrays.asList("str1", "str2", "str3"));
 *         System.out.println(listStr);
 * //Перебираем и добираемся к элементу
 *         for (int i = 0; i < listStr.size(); i++) {
 *         System.out.print(listStr.get(i) + " $ ");
 *         }
 *         System.out.println();
 *
 * //или через for-each
 *         for (String s : listStr) {
 *         System.out.print(s + " $$ ");
 *         }
 *                 System.out.println();
 */

/**
 *  //Итерируем List (ПЕРЕБИРАЕМ)
 *         List<String> list = new LinkedList<>();
 *         list.add("qwert0");
 *         list.add("qwert1");
 *         list.add("qwert2");
 *         list.add("qwert3");
 *         list.add("qwert4");
 *         System.out.println(list);
 *
 *         //Пройдемся по List и удалим строку
 *         String delStr="qwert2";
 *         Iterator<String> iterator = list.iterator();
 *         while (iterator.hasNext()){
 *             String element = iterator.next();
 *             System.out.println(element);
 *             if(element.equals(delStr)) {
 *                 iterator.remove();
 *             }
 *         }
 *         System.out.println(list);
 *
 *         //Перебираем и печатаем каждый элеммент
 *         for (String s : list){
 *             System.out.println(s);
 *         }
 *
 *         for (Iterator<String> iterator1=list.iterator();
 *         iterator1.hasNext(); ){
 *             String element = iterator.next();
 *             System.out.println("> " + element);
 *         } // плохая форма записи итератора!!!!!!!
 */

        /**
        * РОБОТА С LinkedList
        */
/**
 * // формируем лист
 *         List<Integer> integers = new LinkedList<>();
 *         int size = 1_000_000;
 *         int counter = 0;
 *         for (int i = 0; i < size; i++) {
 *             integers.add(counter++);
 *         }
 * //        System.out.println("=== PrintIterator ===");
 * //        printUseIterator(integers);
 *         System.out.println("=== PrintIndex ===");
 *         printUseIndexes(integers);
 *
 *
 *     }
 *
 *     private static void printUseIndexes(List<Integer> list) {
 *         for (int i = 0; i < list.size(); i++) {
 *             System.out.println(list.get(i));
 *         }
 *     } // Будет очень долго перебирать
 *
 *     private static void printUseIterator(List<Integer> list) {
 *         for (Integer i : list) {
 *             System.out.println(i);
 *         }
 *     }
 */


}
