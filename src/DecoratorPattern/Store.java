package DecoratorPattern;

import DecoratorPattern.Decorator.ExtraMushroom;

public class Store {
    public static void main(String args[]){
        BasePizza pizza= new ExtraMushroom(new Margharita());
        System.out.println(pizza.cost());
    }
}
