public class Main {
    public static void main(String[] args) {

        // Доступен
        Programmer prog1 = new Programmer("Иван", "доступен");
        testProgrammer(prog1, "написать код");
        System.out.println("============================");

        // Занят
        Programmer prog2 = new Programmer("Петр", "занят");
        testProgrammer(prog2, "исправить баги");
        System.out.println("============================");

        // Не доступен
        Programmer prog3 = new Programmer("Мария", "не доступен");
        testProgrammer(prog3, "сделать кофе");
    }

    private static void testProgrammer(Programmer programmer, String task) {
        try {
            String result = programmer.doWork(task);
            System.out.println("Результат работы: " + result);

        } catch (ProgrammerBusyException e) {
            System.out.println(e.getMessage());

        } catch (ProgrammerUnavailableNowException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Допустим, у вас в программе есть класс Programmer. Кроме имени у нег есть
//поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».
//У программиста необходимо реализовать метод String doWork(String taskMsg) который в качестве
//результата, либо возвращает stringMsg большими буквами, либо ProgrammerBusyException,
//либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.
//В зависимости от результата, вызывающий main выводить результат работы или сообщение
//«Программист занят другой задачей» или «Программист не доступен».