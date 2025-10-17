public enum Color3 {
    GREEN("зеленый", 0x00FF00) {
        @Override
        public void print() {
            System.out.println("print like green");
        }
    },
    BLACK("черный", 0x000000){
        @Override
        public void print() {
            System.out.println("print like black");
        }
    },
    BLUE("синий", 0x0000FF){
        @Override
        public void print() {
            System.out.println("print like blue");
        }
    },
    RED("красный", 0xFF0000) {
        @Override
        public void print() {
            System.out.println("print like red");
        }
    };


    // опишемо клас
    private String title;
    private int code;

    // створюємо конструктор

    Color3(String title, int code) {
        this.title = title;
        this.code = code;
    }

    // Геттери і Сеттери
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    // Створюю метод (буде друкуквати кольори)
    public abstract void print();

}
