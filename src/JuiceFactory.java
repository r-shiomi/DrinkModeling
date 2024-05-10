public class JuiceFactory implements DrinkFactory {
    @Override
    public Drink createDrink(String name) {
        return new Juice(name);
    }
}
