package com.dubbo.test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.dubbo.api.CarInterface;

/**
 * @Author 马鹏勇
 * @Date 2019/11/3 上午11:31
 */
public class TestDubboSpi {
    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);
        CarInterface carInterface = extensionLoader.getExtension("red");
        carInterface.getColor();
    }
}
