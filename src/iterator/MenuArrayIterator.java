package iterator;

/**
 * MenuArray迭代器
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class MenuArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public MenuArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
