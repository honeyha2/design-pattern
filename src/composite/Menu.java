package composite;

import java.util.ArrayList;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-29
 */
public class Menu extends MenuComponent {
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        menuComponents.forEach(menuComponent -> menuComponent.print());
    }
}
