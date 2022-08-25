package strategy.duck;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
