package com.gupao.factorymethod;

import com.gupao.ICar;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICarFactory factory = new BydFactory();
        ICar car = factory.create();
        car.buy();
    }
}
