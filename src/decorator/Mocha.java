package decorator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-28
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.10f;
    }
}
