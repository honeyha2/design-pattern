package strategy.simple;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public class RunStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("i am running");
    }
}
