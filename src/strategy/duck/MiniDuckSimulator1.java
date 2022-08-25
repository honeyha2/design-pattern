package strategy.duck;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class MiniDuckSimulator1 {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performFly();
        mallard.performQuack();
    }
}
