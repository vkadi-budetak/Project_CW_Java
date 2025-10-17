public enum RoomType {
    STANDARD("STANDARD", "стандартный однокомнатный номер", 50.0),
    JUNIOR("JUNIOR", "однокомнатный номер с мини-кухней", 70.0),
    SUITE("SUITE", "номер улучшенной планировки", 90.0),
    STUDIO("STUDIO", "улучшенной планировки, из двух комнат", 120.0),
    DELUXE("DELUXE", "номер повышенного комфорта", 200),
    PRESIDENT("PRESIDENT", "самые роскошные номера", 250),
    ;

    private  String name;
    private String description;
    private double basePrice;

    // Конструктор
    RoomType(String name, String description, double basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }


    //Геттери и Сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return name + " (" + description + basePrice + " )";
    }
}
