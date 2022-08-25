package strategy.simple;

/**
 * 上下文类，持有具体策略类的实例，并负责调用相关的算法
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public class Context {

    Strategy strategy;


    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }

    public void replaceStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
