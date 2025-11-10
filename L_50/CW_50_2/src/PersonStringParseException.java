import java.util.ArrayList;
import java.util.List;

public class PersonStringParseException extends RuntimeException {
    private String personString;
    private List<String> messages = new ArrayList<>();

    public PersonStringParseException(String personString) {
        this.personString = personString;
    }

    public String getPersonString() {
        return personString;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void adMsg(String msg) {
        messages.add(msg);
    }

}
