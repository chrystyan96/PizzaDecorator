package chocolate;

import interfaces.IComponent;
import interfaces.IPlugin;
import decorator.PizzaDecorator;

public class Chocolate extends PizzaDecorator implements IPlugin {

    public Chocolate() {
        super(null);
    }
    
    @Override
    public void doPizza() {
        decorated.doPizza();
        System.out.print("| Chocolate |");
    }

    @Override
    public void initialize() {
    }
}
