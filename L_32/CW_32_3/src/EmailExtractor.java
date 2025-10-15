public class EmailExtractor implements PersonInfoExtractor{
    @Override
    public String apply(Person person) {
        return person.getEmail();
    }
}
