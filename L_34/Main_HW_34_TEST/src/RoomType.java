public enum RoomType {
    STANDART("Standart","стандартный однокомнатный номер",70),
    STUDIO("Studio", "однокомнатный номер с мини-кухней",85),
    JUNIOR("Junior Suite", "номер улучшенной планировки",90 ),
    SUITE("Suite","двухкомнатный номер улучшенной планировки",110),
    DELUXE("De Luxe", "номер повышенного комфорта",150),
    PRESIDENT("President", "самые роскошные номера",250);

    private String name;
    private String description;
    private double basePrice;

    RoomType(String name, String description, double basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return name + "(" + description + ", "  + basePrice + ")";
    }
}
