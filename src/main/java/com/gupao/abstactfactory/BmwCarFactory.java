package com.gupao.abstactfactory;

import com.gupao.BmwCar;
import com.gupao.BydCar;
import com.gupao.ICar;
import com.gupao.IPhone;

public class BmwCarFactory implements ICarFactory{
    public ICar createCar(){
        return new BmwCar();
    }

    public IPhone createPhone(){
        return new BmwPhone();
    }
}
