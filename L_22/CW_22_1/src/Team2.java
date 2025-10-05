public class Team2 {
    private int capacity =100;
    private int size=0;
    private Person[] array;

    public Team2() {
        this.array=new Person[capacity];
    }

    public void add(Person person){
        if (size<array.length){
            array[size]=person;
            size++;
        }
        else
            System.out.println("Error, array заполнен");
    }

    public int size(){
        return size;
    }

    public Person get(int index){
        if (index>=0 && index<size)
            return array[index];
        return null;
    }

    public String toString(){
        String result="";
        for (int i=0; i<size;i++)
            result+=(i+1) + ". "+array[i].personInfo()
                    + System.lineSeparator();
        return result;
    }
}
