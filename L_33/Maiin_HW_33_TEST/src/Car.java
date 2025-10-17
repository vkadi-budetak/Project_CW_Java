import java.util.*;
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

public  class Car implements Comparable<Car> {
    private final String plate; //Обязательное
    private final int year; //Обязательное
    private final String model; //Обязательное
    private final String color; //Обязательное

    private String owner;
    private double volume;
    private double power;
    private int numberInsurance;

    public Car(Builder builder){
        this.plate= builder.plate;
        this.year= builder.year;
        this.model= builder.model;
        this.color= builder.color;
        this.owner= builder.owner;
        this.volume= builder.volume;
        this.power=builder.power;
        this.numberInsurance=builder.numberInsurance;
    }

    public static class Builder{
        private String plate; //Обязательное
        private int year; //Обязательное
        private String model; //Обязательное
        private String color; //Обязательное

        private String owner="---";
        private double volume=0.0;
        private double power=0.0;
        private int numberInsurance=0;

        //Конструктор только на обязательные поля//
        public Builder(String plate, String model, String color,  int year) {
            this.color = color;
            this.model = model;
            this.year = year;
            this.plate = plate;

        }
        // Заполняльщики на все не обязательные поля
        public Builder owner(){
            Scanner myScan=new Scanner(System.in);
            System.out.println("Введите владельца авто: ");
            String owner=myScan.nextLine();
            if(owner!=null && !owner.isBlank())
                this.owner = owner;
            else System.out.println("Введена пустая строка.");
            return this;
        }

        public Builder volume(){
            Scanner myScan=new Scanner(System.in);
            System.out.println("Введите объем двигателя: ");
            String volume=myScan.nextLine().trim();
            Double doubleVolume=0.0;
            if(volume!=null && !volume.isBlank()){
                doubleVolume= Double.parseDouble(volume);
                if(doubleVolume>0)
                    this.volume=doubleVolume;
                else System.out.println("Введено недопустимое значение.");
            } else System.out.println("Введена пустая строка.");

            return this;
        }

        public Builder power(){
            Scanner myScan=new Scanner(System.in);
            System.out.println("Введите мощность автомобиля: ");
            String power=myScan.nextLine().trim();
            Double doublePower=0.0;
            if(power!=null && !power.isBlank()){
                doublePower= Double.parseDouble(power);
                if(doublePower>0)
                    this.volume=doublePower;
                else System.out.println("Введено недопустимое значение.");
            } else System.out.println("Введена пустая строка.");
            return this;
        }

        public Builder numberInsurance(){
            Scanner myScan=new Scanner(System.in);
            System.out.println("Введите номер страхования: ");
            String numberInsurance=myScan.nextLine().trim();
            int intNumberInsurance=0;
            if(numberInsurance!=null && !numberInsurance.isBlank()){
                intNumberInsurance=Integer.parseInt(numberInsurance);
                if(intNumberInsurance>0)
                    this.numberInsurance=intNumberInsurance;
                else System.out.println("Введено недопустимое значение.");
            } else System.out.println("Введена пустая строка.");
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return model+"{" + plate + "}: "
                + year +"г., " + color + ", volume=" + volume +", power=" + power
                +"(Owner: "+owner+", numberInsurance: "+ numberInsurance +").";
    }

    @Override
    public int compareTo(Car o) {
        return this.plate.compareTo(o.plate);
    }
}
