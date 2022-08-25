package iterator;

import java.util.List;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.forEach(menu -> printMenu(menu));
    }

    public void printMenu(Menu menu) {
        Iterator iterator = menu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
