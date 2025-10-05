public class CoffeeRecipe {

    private String name;
    private int coffeeGr;
    private int waterMl;
    private int milkMl;

    public CoffeeRecipe(String name, int coffeeGr, int waterMl, int milkMl) {
        this.name = name;
        this.coffeeGr = coffeeGr;
        this.waterMl = waterMl;
        this.milkMl = milkMl;
    }

    public CoffeeRecipe() {
        this("Unknown", 0, 0, 0);
    }


    public int getCoffeeGr() {
        return coffeeGr;
    }

    public void setCoffeeGr(int coffeeGr) {
        if (coffeeGr < 0 || coffeeGr > 500) {
            System.out.println("WARN: кава " + coffeeGr + " г — недопустимо (0.." + 500 + ")");
            return;
        }
        this.coffeeGr = coffeeGr;
    }

    public int getWaterMl() {
        return waterMl;
    }

    public void setWaterMl(int waterMl) {
        if (waterMl < 0 || waterMl > 1000) {
            System.out.println("WARN: вода " + waterMl + " мл — недопустимо (0.." + 1000 + ")");
            return;
        }
        this.waterMl = waterMl;
    }

    public int getMilkMl() {
        return milkMl;
    }

    public void setMilkMl(int milkMl) {
        if (milkMl < 0 || milkMl > 500) {
            System.out.println("WARN: молоко " + milkMl + " мл — недопустимо (0.." + 500 + ")");
            return;
        }
        this.milkMl = milkMl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CoffeeRecipe{" +
                "name='" + name + '\'' +
                ", coffeeGr=" + coffeeGr +
                ", waterMl=" + waterMl +
                ", milkMl=" + milkMl +
                '}';
    }

    public void makeStandardCoffee() {
        final int needCoffee = 30;
        final int needWater = 100;
        final int needMilk = 50;

        boolean ok = true;

        if (coffeeGr < needCoffee) {
            System.out.println("Недостаточно кофе: нужно " + needCoffee + " г");
            ok = false;
        }
        if (waterMl < needWater) {
            System.out.println("Недостаточно воды: нужно " + needWater + " мл");
            ok = false;
        }
        if (milkMl < needMilk) {
            System.out.println("Недостаточно молока: нужно " + needMilk + " мл");
            ok = false;
        }
        if (!ok) return;

        System.out.println("Начинаю процесс приготовления:");
        System.out.println("измельчаю " + needCoffee + " г кофе");
        System.out.println("добавляю " + needWater + " мл воды");
        System.out.println("вливаю " + needMilk + " мл молока");

        coffeeGr -= needCoffee;
        waterMl -= needWater;
        milkMl -= needMilk;

        System.out.println("Готово! Приятного кофе ☕");
    }
}
