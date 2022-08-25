package templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {

        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
