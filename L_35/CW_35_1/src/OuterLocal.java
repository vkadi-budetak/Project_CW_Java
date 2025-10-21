public class OuterLocal {
    public void method(){
        int x=10;
        class Inner{
            public void innerMethod(){
                System.out.println("x= "+ x);
            }
        }
        Inner inner=new Inner();
        inner.innerMethod();

    }

}
