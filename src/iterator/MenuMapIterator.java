package iterator;

import java.util.Map;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class MenuMapIterator implements Iterator {
    Map<Integer, MenuItem> menuItemMap;
    int position;

    public MenuMapIterator(Map<Integer, MenuItem> menuItemMap) {
        this.menuItemMap = menuItemMap;
    }

    @Override
    public boolean hasNext() {
        return menuItemMap.values().size() > position++;
    }

    @Override
    public MenuItem next() {
        java.util.Iterator<MenuItem> iterator = menuItemMap.values().iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }
}
