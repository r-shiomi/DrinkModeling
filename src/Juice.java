public class Juice extends Drink {

    Juice(String name) {
        super(name);
        System.out.println("Create juice:" + name);
    }

    @Override
    public void consume() {
        System.out.println(super.getName() + "ジュースを飲みます");
    }
}
