// 飲料
public abstract class Drink {
    private String name;

    Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 消費
    public abstract void consume();
}
