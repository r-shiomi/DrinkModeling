/**
 * 容器クラス
 */
public class Container implements Shakable, Openable, Drinkable {
    private final Drink drink;
    private boolean isOpen;
    private final Material material;

    public Container(Drink drink, Material material) {
        this.drink = drink;
        this.isOpen = false;
        this.material = material;
    }

    public void open() {
        this.isOpen = true;
        if(material == Material.CAN) {
            System.out.println("缶のプルタブを開けました。");
        }else if (material == Material.PLASTICBOTTLE){
            System.out.println("ペットボトルのキャップを開けました。");
        }
    }

    public void drink() {
        if (isOpen) {
            if (drink != null) {
                drink.consume();
            } else {
                System.out.println("容器には飲み物が入っていません。");
            }
        } else {
            System.out.println("容器が開いていません。先に容器を開けてください。");
        }
    }

    @Override
    public void shake() {
        System.out.println("容器を振る。");
    }

    public String getDrinkName() {
        return drink.getName();
    }
}
