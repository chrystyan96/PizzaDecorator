package goiabada;

import interfaces.IComponent;
import interfaces.IPlugin;
import decorator.PizzaDecorator;

public class Goiabada extends PizzaDecorator implements IPlugin {

    public Goiabada() {
        super(null);
    }
    
    @Override
    public void doPizza() {
        decorated.doPizza();
        System.out.print("| Goiabada |");
    }

    @Override
    public void initialize() {
    }
}
