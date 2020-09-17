package strategy.fly;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly with rocket!");
    }

}
