package composite;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
