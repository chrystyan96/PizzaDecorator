package catupiry;

import interfaces.IComponent;
import interfaces.IPlugin;
import decorator.PizzaDecorator;

public class Catupiry extends PizzaDecorator implements IPlugin{

    public Catupiry() {
        super(null);
    }
    
    @Override
    public void doPizza() {
        decorated.doPizza();
        System.out.print("| Catupiry |");
    }

    @Override
    public void initialize() {
    }

}
