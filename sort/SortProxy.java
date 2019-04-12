/*
 * Copyright (c) 2019. Zhangrb write this code. If any question mail mrzhangrb@outlook.com
 */

package com.algorithm.sort;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class SortProxy<E extends List> implements InvocationHandler {
    private E obj;
    private static SortProxy Instance;
    private Drawable pen;

    SortProxy(){
        super();
    }
    SortProxy(E obj) {
        this.obj = obj;
        this.pen = new ConsoleDraw();
    }

    SortProxy(E obj, Drawable pen) {
        this.obj = obj;
        this.pen = pen;
    }

    public static List getProxy(List obj){
        if(Instance == null){
            Instance = new SortProxy(obj);
        }
        List i = (List) Proxy.newProxyInstance(List.class.getClassLoader(), new Class[] {List.class}, Instance);
        return i;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = method.invoke(obj, args);
        if(method.getName().equals("set")){
            if(pen != null){
                pen.draw(obj);
            }
        }
        return ret;
    }
}
