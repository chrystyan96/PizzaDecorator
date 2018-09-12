package logica;

import decorator.PizzaDecorator;
import interfaces.IComponent;

public class BasicPizza extends PizzaDecorator { 

    public BasicPizza(IComponent decorated) {
        super(decorated);
    }
    
     public BasicPizza() {
        super(null);
    }

    @Override
    public void doPizza() {
        System.out.print("| Massa de pão, Queijo, Molho | ");
    } 
}