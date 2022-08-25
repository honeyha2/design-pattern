package strategy.duck;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // 默认的行为
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
