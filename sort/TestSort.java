/*
 * Copyright (c) 2019. Zhangrb write this code. If any question mail mrzhangrb@outlook.com
 */

package com.algorithm.sort;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        List<Integer> list = (List)SortProxy.getProxy(obj);
        list.add(1);
        list.add(15);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(4);

        BubbleSort sortTool = new BubbleSort();
        System.out.println(sortTool.sort(list).toString());
    }
}
