package factory.pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:46
 */
public class LondonCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦芝士Pizza");
    }
}
