public class JuiceFactory implements DrinkFactory {
    @Override
    public Container createDrink(String name, Material material) {
        return new Container(new Juice(name), material);
    }
}
