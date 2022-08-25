package proxy.mydemo;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-05
 */
public class TeaProduct implements ProductFactory {
    @Override
    public void action() {
        System.out.println("我是生产茶叶的......");
    }
}
