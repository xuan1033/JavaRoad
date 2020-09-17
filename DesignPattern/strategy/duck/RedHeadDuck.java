package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();//红头鸭子呱呱叫
        flyBehavior = new FlyWithWings();//红头鸭子有翅膀，可以飞行
    }

    @Override
    public void display() {
        //外观是红头
        System.out.println("I am a real RedHead duck");
    }
}
