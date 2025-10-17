import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
HW_33_TEXT
С использованием патерна Билдер решить следующую задачу
Для программы регистрации автомобилей предусмотреть
создание инстансов Car с набором обязательных полей:
String plate
int year
String model
String color

и необязательные поля
String owner
double volume
double power
int numberInsurance

Ввод обязательных полей организовать в мэйне,
а необязательные поля запросить с консоли в
заполняльщиках с соответсвующей проверкой на адекватность.

Породить три инстанса, уложить их в лист,
отсортировать их по номеру регистрации
и вывести на печать отсортированный список
 */
public class Main {
    public static void main(String[] args) {
        Car car1=new Car.Builder("DE1111","Audi","black",2024)
                .owner()
                .volume()
                .power()
                .numberInsurance()
                .build();
        Car car2=new Car.Builder("WE2222","Mersedes","white",2025)
                .owner()
                .volume()
                .power()
                .numberInsurance()
                .build();
        Car car3=new Car.Builder("FE3333","Volvo","red",2020)
                .owner()
                .volume()
                .power()
                .numberInsurance()
                .build();


        List<Car> carList=new ArrayList<>(List.of(car1,car2,car3));
        System.out.println("=========List===============");
        printList(carList);
        System.out.println();
        Collections.sort(carList);
        System.out.println("==========Sort===========");
        printList(carList);

    }

    public static void printList(List<Car> list){
        for(Car c:list){
            System.out.println("\uD83D\uDE97"+ c);
        }
    }
}
