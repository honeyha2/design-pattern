package templatemethod;

/**
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-30
 */
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        brew();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        boilWater();
        pourInCup();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
