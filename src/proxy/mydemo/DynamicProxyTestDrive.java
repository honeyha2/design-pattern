package proxy.mydemo;

/**
 * https://www.cnblogs.com/fsmly/p/11031395.html
 * <p>
 * 那么我们想一下，上面这种称为静态代理的方式有什么缺点呢？因为每一个代理类只能为一个借口服务(因为这个代理类需要实现这个接口，然后去代理接口实现类的方法)
 * 这样一来程序中就会产生过多的代理类。比如说我们现在又来一个接口，那么是不是也需要提供去被代理类去实现它然后交给代理类去代理执行呢，那这样程序就不灵活了。
 * 那么如果有一种方式，就可以处理新添加接口的以及实现那不就更加灵活了吗，在java中反射机制的存在为动态代理创造了机会
 * <p>
 * 现在我们对比jdk提供的动态代理和我们刚刚实现的静态代理，刚刚说到静态代理对于新添加的接口需要定义对应的代理类去代理接口的实现类。
 * 而上面的测试程序所使用的动态代理规避了这个问题，即我们不需要显示的指定每个接口对应的代理类，有新的接口添加没有关系，只需要在使用的时候传入接口对应的实现类然后返回代理类对象（接口实现类型），然后调用被代理类的方法即可。
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-05
 */
public class DynamicProxyTestDrive {

    public static void main(String[] args) {
        DynamicProxyProductFactory dynamicProxyProductFactory = new DynamicProxyProductFactory(new TeaProduct());
        ProductFactory productFactory = dynamicProxyProductFactory.getProxy();
        productFactory.action();
    }
}
