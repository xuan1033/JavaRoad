package strategy.duck;


import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();//鸭子模型不会飞
        quackBehavior = new MuteQuack();//鸭子模型不会叫
    }

    @Override
    public void display() {
        //鸭子模型
        System.out.println("I am a Model duck");
    }
}
