package decorator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-28
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.00f;
    }
}
