public class Coffee extends Drink {

    Coffee(String name) {
        super(name);
        System.out.println("Create coffee:" + name);
    }

    @Override
    public void consume() {
        System.out.println(super.getName() + "コーヒーを飲みます。");
    }
}
