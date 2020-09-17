package strategy;


import strategy.duck.Duck;
import strategy.duck.ModelDuck;
import strategy.duck.RedHeadDuck;
import strategy.fly.FlyWithRocket;
import strategy.quack.Squeak;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();//初始化模型鸭子 不会叫 不会飞
        modelDuck.performFly();//我不会飞...
        modelDuck.performQuack();//沉默...
        modelDuck.setFlyBehavior(new FlyWithRocket());//给模型鸭子加上火箭飞行器
        modelDuck.performFly();//模型鸭子火箭发射！
        Duck redHeadDuck = new RedHeadDuck();//初始化红头鸭子，可以叫，可以飞
        redHeadDuck.performFly();//我可以用翅膀飞行
        redHeadDuck.performQuack();//我会呱呱叫
        redHeadDuck.setQuackBehavior(new Squeak());//将鸭子嘴绑住
        redHeadDuck.performQuack();//吱吱叫
    }

    /**
     * 总结：策略模式通过注入一系列的策略群，来定义策略的用法
     * 将策略群注入到抽象方法中，子类可选择合适的策略来拥有不同的表现形式
     * 并可以在运行过程中改变策略，从而实现不同的表现形式
     */
}
