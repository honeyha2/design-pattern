package proxy.mydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-05
 */
public class DynamicProxyProductFactory implements InvocationHandler {
    private ProductFactory productFactory;

    public DynamicProxyProductFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    public ProductFactory getProxy() {
        return (ProductFactory) Proxy
                .newProxyInstance(productFactory.getClass().getClassLoader(), productFactory.getClass().getInterfaces(),
                        new DynamicProxyProductFactory(productFactory));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是动态代理类，可以代理全部的实现类，这是我代理之前要准备的事情......");

        // 这里的返回值，就相当于真正调用的被代理类方法的返回值
        Object returnVal = method.invoke(this.productFactory, args);
        System.out.println("我是动态代理类，可以代理全部的实现类，这是我代理之后要准备的事情......");

        return returnVal;
    }
}
