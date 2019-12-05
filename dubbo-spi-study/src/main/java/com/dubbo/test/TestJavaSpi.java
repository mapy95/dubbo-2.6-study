package com.dubbo.test;

import com.dubbo.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author 马鹏勇
 * @Date 2019/11/2 下午4:20
 */
public class TestJavaSpi {
    public static void main(String[] args) {
        ServiceLoader<CarInterface> serviceLoader = ServiceLoader.load(CarInterface.class);
        Iterator<CarInterface> interfaces = serviceLoader.iterator();
        while (interfaces.hasNext()){
            CarInterface carInterface = interfaces.next();
            carInterface.getColor();
        }
//        System.out.println("sss");
    }
}
