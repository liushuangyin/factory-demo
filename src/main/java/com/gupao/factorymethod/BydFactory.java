package com.gupao.factorymethod;

import com.gupao.BydCar;
import com.gupao.ICar;

public class BydFactory implements ICarFactory{
    @Override
    public ICar create(){
        return new BydCar();
    }
}
