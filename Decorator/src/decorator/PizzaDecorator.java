package decorator;

import interfaces.IComponent;


public class PizzaDecorator implements IComponent {
    
    protected IComponent decorated;

    protected PizzaDecorator() {
    }
    
    protected PizzaDecorator(IComponent decorated) {
        this.decorated = decorated;
    }
    
    public void setDecorated(IComponent decorated) {
        this.decorated = decorated;
    }
    
    @Override
    public void doPizza() {
        decorated.doPizza();
    }
}
