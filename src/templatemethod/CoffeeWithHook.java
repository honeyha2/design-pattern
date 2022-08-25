package templatemethod;

import java.util.Random;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        int random = new Random().nextInt();
        return random % 2 == 0 ? true : false;
    }
}
