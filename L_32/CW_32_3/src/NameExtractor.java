public class NameExtractor implements PersonInfoExtractor{
    @Override
    public String apply(Person person) {
        return person.getfName() + " " + person.getlName();
    }
}
