public class PersonStringParserImpl implements PersonStringParser{
     PersonStringParseException exception;


     // Jeff,jeff@mail.com,23;Jack,jack@mail.com,45;Nick,nick@mail.com,24;Oleg,oleg@mail.com,22
    // обрабатываем в main и передаем сюда фрагмент строки по одному персону (делиметр ;)
    // Jeff,jeff@mail.com,23 обрабатываем тут код ниже

    @Override
    public Person parse(String str) {
        String[] dataArr = str.trim().split(",");
        exception = new PersonStringParseException(str);

        if (dataArr.length<3)
            exception.adMsg("неправильный формат строки, недостаточно полей");
        else {
            if (!checkEmail(dataArr[1]))
                exception.adMsg("не правильный email" + dataArr[1]);
            if (!checkAge(dataArr[2]))
                exception.adMsg("не правильный email" + dataArr[2]);
        }
        return new Person(dataArr[0], dataArr[1], Integer.parseInt(dataArr[2]));
    }

    private boolean checkAge(String age) {
        try {
            return Integer.parseInt(age)>=0;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean checkEmail(String email) {
        return email != null && email.contains("@");
    }
}
