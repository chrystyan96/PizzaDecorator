package bacon;

import interfaces.IComponent;
import interfaces.IPlugin;
import decorator.PizzaDecorator;

public class Bacon extends PizzaDecorator implements IPlugin {

    public Bacon() {
        super(null);
    }
    
    @Override
    public void doPizza() {
        decorated.doPizza();
        System.out.print("| Bacon |");
    }

    @Override
    public void initialize() {
    }
}

