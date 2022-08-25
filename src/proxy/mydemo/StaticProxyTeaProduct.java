package proxy.mydemo;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-05
 */
public class StaticProxyTeaProduct implements ProductFactory {
    ProductFactory productFactory;

    public StaticProxyTeaProduct(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @Override
    public void action() {
        System.out.println("我是静态代理类，只能代理一个具体的实现类，我开始代理执行方法了......");
        productFactory.action();
    }
}
