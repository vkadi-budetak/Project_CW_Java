public class SpecialFormatExtractor  implements PersonInfoExtractor{
    @Override
    public String apply(Person person) {
        return person.getfName() + " " + person.getlName() + ";" + "(" + person.getAge() +
                ");" + person.getEmail();
    }
}
