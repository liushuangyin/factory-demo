package com.gupao.factorymethod;

import com.gupao.BmwCar;
import com.gupao.BydCar;
import com.gupao.ICar;

public class BmwFactory implements ICarFactory{
    @Override
    public ICar create(){
        return new BmwCar();
    }
}
