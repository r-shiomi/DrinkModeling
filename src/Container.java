/**
 * 容器クラス
 */
public class Container implements Shakable, Openable, Drinkable {
    private Drink drink;
    private boolean isOpen;

    // 余裕があれば素材（ペットボトル、缶）フィールドを足し、openメソッド等で利用する

    public Container(Drink drink) {
        this.drink = drink;
        this.isOpen = false;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("容器を開けました。");
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
        return this.drink.getName();
    }
}
