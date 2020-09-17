package strategy.duck;


import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public abstract class Duck {//鸭子抽象类，注入飞行模式，声音模式

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();//鸭子独有的表现类型

    public void performFly() {
        flyBehavior.fly();
    }//飞行模式的飞行方法

    public void performQuack() {
        quackBehavior.quack();
    }//声音模式的声音方法

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
