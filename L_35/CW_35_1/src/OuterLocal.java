// ЛОКАЛЬНЫЙ КЛАСС (Если не хвавтает класса здесь и сейчас тогда делают локальный класс)
public class OuterLocal {
    public void method(){
        int x=10;

        // Inner - ЛОКАЛЬНЫЙ КЛАСС
        class Inner{
            public void innerMethod(){
                System.out.println("x= "+ x);
            }
        }
        Inner inner=new Inner(); // обращаюсь к классу
        inner.innerMethod(); // вызываю метод

    }

}
