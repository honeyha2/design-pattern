package iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class KuaishouMenu implements Menu {

    Map<Integer, MenuItem> menuItems;
    Iterator iterator;

    public KuaishouMenu() {
        menuItems = new HashMap<>();

        addItem("KUAISHOU K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("KUAISHOU Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("KUAISHOU Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("KUAISHOU Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(new Random().nextInt(), menuItem);
    }

    @Override
    public Map<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }

    @Override
    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }
}
