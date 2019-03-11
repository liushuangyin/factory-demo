package com.gupao.simplefactory;

import com.gupao.BydCar;
import com.gupao.ICar;

/**
 * @author liusy
 * @date 2019-03-10
 */
public class CarFactory {
    public ICar create(String name){
        if("byd".equals(name)){
            return new BydCar();
        }else{
            return null;
        }
    }

    public Object createBean(String className){
        try{
            if(className != null && !"".equals(className)) {
                return Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Object createBean(Class clazz){
        try{
            if(clazz != null) {
                return  clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
