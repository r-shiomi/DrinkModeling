public class CoffeeFactory implements DrinkFactory {
    @Override
    public Container createDrink(String name, Material material) {
        return new Container(new Coffee(name), material);
    }
}
