package strategy.duck;


import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();//绿头鸭子呱呱叫
        flyBehavior = new FlyWithWings();//绿头鸭子有翅膀 可以飞行
    }

    @Override
    public void display() {
        //外观是绿头
        System.out.println("I am a real Mallard duck");
    }
}
