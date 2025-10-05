public class Team {
    private Person[] array;

    public Team(Person[] array) {
        this.array = array;
    }

    public String toString(){
        String result="";
        for (int i=0; i<array.length;i++)
            result+=(i+1) + ". "+array[i].personInfo()
                    + System.lineSeparator();
        return result;
    }
}
