package proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(person, args);
        } else if (method.getName().equals("setGeekRating")) {
            return method.invoke(person, args);
        } else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
