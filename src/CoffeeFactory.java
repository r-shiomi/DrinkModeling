public class CoffeeFactory implements DrinkFactory {
    @Override
    public Drink createDrink(String name) {
        return new Coffee(name);
    }
}
