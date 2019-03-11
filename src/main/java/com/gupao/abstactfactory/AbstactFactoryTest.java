package com.gupao.abstactfactory;

import com.gupao.ICar;
import com.gupao.IPhone;

public class AbstactFactoryTest {
    public static void main(String[] args) {
        ICarFactory factory = new BydCarFactory();
        ICar car = factory.createCar();
        IPhone phone = factory.createPhone();
        car.buy();
        phone.create();
    }
}
