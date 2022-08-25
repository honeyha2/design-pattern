package iterator;

import java.util.List;

/**
 * MenuList迭代器
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class MenuListIterator implements Iterator {
    List<MenuItem> items;
    int possition = 0;

    public MenuListIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() > possition;
    }

    @Override
    public MenuItem next() {
        return items.get(possition++);
    }
}
