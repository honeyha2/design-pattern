package state.demo;

/**
 * GumballMachine为Context
 *
 * <p>
 * 状态流转：soldOutState -> noQuarterState -> hasQuarterState -> soldState -> soldOutState/noQuarterState
 *
 * <p>
 * 糖果机可能发生的动作（这些动作将暴露给客户）：
 * insertQuarter 投入硬币
 * ejectQuarter 退币
 * turnCrank 转动曲柄
 * dispense 释放糖果
 * refill 重新装填糖果机
 * 收到客户的调用后，将动作委托给当前状态执行
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State state;
    int count = 0;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldOutState(this);
        soldOutState = new SoldOutState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void dispense() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    int getCount() {
        return count;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
