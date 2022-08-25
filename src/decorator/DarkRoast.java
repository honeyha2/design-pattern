package decorator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-28
 */
public class DarkRoast extends Beverage{

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.25f;
    }
}
