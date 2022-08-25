package proxy.mydemo;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-05
 */
public class StaticProxyTestDrive {
    public static void main(String[] args) {
        ProductFactory proxyTeaProduct = new StaticProxyTeaProduct(new TeaProduct());
        proxyTeaProduct.action();
    }
}
