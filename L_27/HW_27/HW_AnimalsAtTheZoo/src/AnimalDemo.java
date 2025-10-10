public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("== Добро пожаловать в ЗООПАРК ==\n");
        // Создаем массив животных - демонстрация полиморфизма
        Animal[] animals = {
                new Lion(),
                new Elephant(),
                new Monkey()
        };

        // Проходим массивы со всеми животным и вызываем их методы
        for (int i = 0; i < animals.length; i++){
            System.out.println("--- Животное " + (i + 1) + " ---");

            animals[i].makeSound();
            animals[i].eat();
            String descriptionAnimal = animals[i].getSpecies();
            System.out.println("Вид животчного: " + descriptionAnimal);
//            System.out.println("Вид животчного: " + animals[i].getSpecies()); // короткая запись
            System.out.println();
        }
        System.out.println("Экскурсия  по зоопарку завершена ");

//          вариант 2
//        Animal[] animals = new Animal[3];
//        animals[0] = new Lion();
//        animals[1] = new Elephant();
//        animals[2] = new Monkey();

//        for (Animal a : animals) {
//            System.out.println("Вид: " + a.getSpecies());
//            a.makeSound();
//            a.eat();
//            System.out.println("-----------");
//        };
    }
}
