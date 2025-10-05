public class CoffeeMachine {
    private String name;
    private int waterMl;
    private int coffeeGr;
    private int milkMl;

    public CoffeeMachine(String name, int waterMl, int coffeeGr, int milkMl) {
        this.name = name;
        this.waterMl = waterMl;
        this.coffeeGr = coffeeGr;
        this.milkMl = milkMl;
    }

    public CoffeeMachine() {
        this("Unknown", 0, 0, 0);
    }

    public void setWaterMl(int waterMl) {
        if (waterMl < 0 || waterMl > 1000) {
            System.out.println("WARN: вода " + waterMl + " мл — недопустимо (0.." + 1000 + ")");
            return;
        }
        this.waterMl = waterMl;
    }

    public void setCoffeeGr(int coffeeGr) {
        if (coffeeGr < 0 || coffeeGr > 500) {
            System.out.println("WARN: кава " + coffeeGr + " г — недопустимо (0.." + 500 + ")");
            return;
        }
        this.coffeeGr = coffeeGr;
    }

    public void setMilkMl(int milkMl) {
        if (milkMl < 0 || milkMl > 500) {
            System.out.println("WARN: молоко " + milkMl + " мл — недопустимо (0.." + 500 + ")");
            return;
        }
        this.milkMl = milkMl;
    }

    public int getWaterMl() {
        return waterMl;
    }

    public int getCoffeeGr() {
        return coffeeGr;
    }

    public int getMilkMl() {
        return milkMl;
    }


    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "name='" + name + '\'' +
                ", waterMl=" + waterMl +
                ", coffeeGr=" + coffeeGr +
                ", milkMl=" + milkMl +
                '}';
    }

    public void makeStandardCoffee() {
        final int needCoffee = 30;
        final int needWater  = 100;
        final int needMilk   = 50;

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
        System.out.println("добавляю " + needWater  + " мл воды");
        System.out.println("вливаю "   + needMilk   + " мл молока");

        coffeeGr -= needCoffee;
        waterMl  -= needWater;
        milkMl   -= needMilk;

        System.out.println("Готово! Приятного кофе ☕");
    }

}

