public enum Color2 {
    GREEN("зеленый", 0x00FF00),
    BLACK("черный", 0x000000),
    BLUE("синий", 0x0000FF),
    RED("красный", 0xFF0000);

    // Прописую параметри
    private String title;
    private int code;

    // Створюю Конструктор
    Color2(String title, int code) {
        this.title = title;
        this.code = code;
    }

    // Створюю Гетери і Сетери
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
}
