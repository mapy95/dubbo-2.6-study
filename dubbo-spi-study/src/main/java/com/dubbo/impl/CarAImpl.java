package com.dubbo.impl;

import com.dubbo.api.CarInterface;

/**
 * @Author 马鹏勇
 * @Date 2019/11/2 下午4:20
 */
public class CarAImpl implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("color");
    }
}
