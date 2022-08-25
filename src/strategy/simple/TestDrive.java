package strategy.simple;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public class TestDrive {
    public static void main(String[] args) {
        Strategy runStrategy = new RunStrategy();
        Context context = new Context(runStrategy);
        context.execute();

        Strategy walkStrategy = new WalkStrategy();
        context.replaceStrategy(walkStrategy);
        context.execute();
    }
}
