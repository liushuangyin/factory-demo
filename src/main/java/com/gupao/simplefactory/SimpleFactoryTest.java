package com.gupao.simplefactory;

import com.gupao.BydCar;
import com.gupao.ICar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICar icar = new BydCar();
        icar.buy();
        CarFactory carFactory = new CarFactory();
        ICar byd = carFactory.create("byd");
        byd.buy();

        ICar bydBean = (ICar) carFactory.createBean("com.gupao.BydCar");
        bydBean.buy();

        ICar bydBean1 = (ICar) carFactory.createBean(BydCar.class);
        bydBean1.buy();
    }
}
