package state.demo;

/**
 * 客户只知道糖果机的动作，不知道糖果机的状态
 * 状态被封装在糖果机内部，封的死死的
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-09-01
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
