package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ExtraMushroom extends ToppingsDecorator {
    BasePizza pizza;
    public ExtraMushroom(BasePizza pizza){
        this.pizza=pizza;
    }
    public int cost(){
        System.out.println(napkins());
        return this.pizza.cost()+10;
    }
    public String napkins(){
        return "Extra Napkin for ExtraMushroom";
    }
}
