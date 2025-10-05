/*
1(31)

# Наследование и полиморфизм: иерархия Car

## 🚗 Задание
Реализуйте базовый класс `Car` с полями: `model`, `year`, `color`, `customsCleared` и
методами: геттеры/сеттеры, конструкторы, `printAllFields()`, `toString()`.
Подклассы:
- `RacingCar(team)`,
- `PassengerCar(owner, passengers)`,
- `PublicCar(company, places)`,
- `Truck(company, capacity)` → `RefrigeratorTruck(temperature)`.
Для каждого: геттеры/сеттеры, конструкторы, `printAllFields()`, `toString()`.
Продемонстрируйте полиморфизм: массив/список `Car` и вызов `printAllFields()`.

 */
public class MainBook {
    public static void main(String[] args) {

        Book bk1=new Book("Tolstoy", "Buratino",333,12345);
        System.out.println(bk1);

        FictionBook fb1=new FictionBook("Gogol", "Vii", 222,23456,"Horror");
        System.out.println(fb1);

        EducationBook eb1=new EducationBook("Ivanov, Petrov", "Physics-6",
                555,56789,"Physics");
        System.out.println(eb1);

        KidsFictionBook kfb1=new KidsFictionBook("Grimm ", "Gretta",
                225,34678,"Story",8);
        System.out.println(kfb1);

        ReligionBook rb1=new ReligionBook("Ivanov","Put k sebe",667,1111,"Buddhism");

        System.out.println("==============================");
        Book[] myLib={bk1,fb1,kfb1,eb1, rb1};

        for (Book b:myLib)
            System.out.println(b);



    }
}

/*
                Book
                ----
            author(String)
            title(String)
            pages(int)
            isbn(int)
            set/get
            Constructors

      |                          |
  FictionBook              EducationBook
  -----------              -------------
  genre(String)            subject(String)
     |
  KidsFictionBook
  --------------
  age(int)




    */

