public class Main {
    public static void main(String[] args) {
        DrinkFactory coffeeFactory = new CoffeeFactory();
        DrinkFactory juiceFactory = new JuiceFactory();
        Container[] containers = {coffeeFactory.createDrink("BOSS無糖ブラック", Material.CAN), juiceFactory.createDrink("バリヤースオレンジ", Material.PLASTICBOTTLE)};

        for (Container container : containers) {
            System.out.println(container.getDrinkName() + "の操作");
            // 容器を振ってみる。
            container.shake();
            // 容器を開けずに飲もうとする
            container.drink();
            // 容器を開けてから飲む
            container.open();
            container.drink();
        }
    }
}