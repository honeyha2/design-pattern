package decorator;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-28
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
