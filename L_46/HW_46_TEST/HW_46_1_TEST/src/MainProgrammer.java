public class MainProgrammer {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Иван", "спит");
        Programmer p2 = new Programmer("Петр", "занят");
        Programmer p3 = new Programmer("Олег", "не доступен");

        String task = "написать калькулятор";

//        handleWork(p1, task);
//        handleWork(p2, task);
//        handleWork(p3, task);

        Programmer[] myTeam={p1,p2,p3};
        for(Programmer p:myTeam)
            handleWork(p,task);
    }

    private static void handleWork(Programmer p, String task) {
        try {
            String result = p.doWork(task);
            System.out.println(p.getName() + " выполнил задачу: " + result);
        } catch (ProgrammerBusyException e) {
            System.out.println(p.getName() + ": Программист занят другой задачей");
        } catch (ProgrammerUnavailableNowException e) {
            System.out.println(p.getName() + ": Программист не доступен");
        } catch (Exception e){
            System.out.println(p.getName()+" -> staus: "+p.getStatus()+ "  NOT VALID!");
        }
    }
}
/*
2.
 Допустим, у вас в программе есть класс Programmer.
 Кроме имени у него есть поле String status;
 и этот статус может иметь значение «доступен» «занят» и «не доступен».
 У класса Programmer необходимо реализовать метод String doWork(String taskMsg)
 который в качестве результата, либо возвращает stringMsg большими буквами,
 либо ProgrammerBusyException, либо ProgrammerUnavailableNowException
 в зависимости от текущего состояния программера.
 В зависимости от результата, вызывающий main выводить результат работы
 или сообщение «Программист занят другой задачей» или
 «Программист не доступен».
 */
