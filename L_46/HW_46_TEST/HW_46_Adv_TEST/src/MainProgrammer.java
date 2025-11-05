
public class MainProgrammer {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("jack");
//        programmer.setBusy();
        programmer.setUnavailable();
        try {
            System.out.println(programmer.doWork("hello from programmer"));
        } catch (ProgrammerException e){
            System.out.println(programmer.getStatus().getMsg());
        }

    }
}


/*
 Допустим, у вас в программе есть класс Programmer.
 Кроме имени у нег есть поле String status;
 и этот статус может иметь значение «доступен» «занят» и «не доступен».
 У программиста необходимо реализовать метод String doWork(String taskMsg)
 который в качестве результата, либо возвращает stringMsg большими буквами,
 либо ProgrammerBusyException, либо ProgrammerUnavailableNowException
 в зависимости от текущего состояния программера.

В зависимости от результата, вызывающий main выводить результат
работы или сообщение «Программист занят другой задачей» или «Программист не доступен».

 */