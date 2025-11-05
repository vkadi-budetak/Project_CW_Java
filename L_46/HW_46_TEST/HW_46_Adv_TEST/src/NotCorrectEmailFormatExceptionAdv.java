import java.util.List;
import java.util.stream.Collectors;

public class NotCorrectEmailFormatExceptionAdv extends RuntimeException {
    private String inputEmail;
    private List<String> errList;

    public NotCorrectEmailFormatExceptionAdv(String message) {
        super(message);
    }
    public NotCorrectEmailFormatExceptionAdv(String message, String inputEmail) {
        super(message);
        this.inputEmail = inputEmail;
    }

    public NotCorrectEmailFormatExceptionAdv(List<String> errList , String inputEmail) {
        super("Email содержит ошибки");
        this.inputEmail = inputEmail;
        this.errList = errList;
    }

    @Override
    public String getMessage(){
        String result = super.getMessage();
        if(errList!=null){
            result+=errList.stream().collect(Collectors.joining(",\n","\n",""));
        }
        return result;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public List<String> getErrList() {
        return errList;
    }
}
