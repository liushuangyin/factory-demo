package com.gupao.abstactfactory;

import com.gupao.ICar;
import com.gupao.IPhone;

public interface ICarFactory {
    ICar createCar();

    IPhone createPhone();
}
