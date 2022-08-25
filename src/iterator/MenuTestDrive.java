package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        List<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        Iterator menuListIterator = new MenuListIterator(pancakeHouseMenuItems);
        Iterator menuArrayIterator = new MenuArrayIterator(dinerMenuItems);
        pancakeHouseMenu.setIterator(menuListIterator);
        dinerMenu.setIterator(menuArrayIterator);

        List<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Menu kuaishouMenu = new KuaishouMenu();
        Map<Integer, MenuItem> kuaishouMenuItem = kuaishouMenu.getMenuItems();
        Iterator menuMapIterator = new MenuMapIterator(kuaishouMenuItem);
        kuaishouMenu.setIterator(menuMapIterator);
        menus.add(kuaishouMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
