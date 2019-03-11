package com.gupao.abstactfactory;

import com.gupao.BydCar;
import com.gupao.ICar;
import com.gupao.IPhone;

public class BydCarFactory implements ICarFactory{
    public ICar createCar(){
        return new BydCar();
    }

    public IPhone createPhone(){
        return new BydPhone();
    }
}
