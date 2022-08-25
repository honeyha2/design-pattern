package state.demo;

/**
 * 状态下可能发生的动作（这些动作将暴露给糖果机）：
 * insertQuarter 投入硬币
 * ejectQuarter 退币
 * turnCrank 转动曲柄
 * dispense 释放糖果
 * refill 重新装填糖果机
 * 每一种状态下，这些动作都有可能发生
 *
 * <p>
 * 由一个状态转换为另一个状态的过程，发生在state接口的实现类中
 *
 * @author lianchang <lianchang@kuaishou.com>
 * Created on 2021-08-31
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
