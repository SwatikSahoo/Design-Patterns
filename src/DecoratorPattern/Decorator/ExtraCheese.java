package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza=pizza;
    }
    public int cost(){
        System.out.println(napkins());
        return this.pizza.cost()+10;
    }
    public String napkins(){
        return "Extra Napkin for ExtraCheese";
    }

}
