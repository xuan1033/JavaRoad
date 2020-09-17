package strategy.quack;

/**
 * @author houxuanting
 * @date 2020/8/13
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
