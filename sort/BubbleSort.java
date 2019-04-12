/*
 * Copyright (c) 2019. Zhangrb write this code. If any question mail mrzhangrb@outlook.com
 */


package com.algorithm.sort;

import java.util.List;


/**
 * The type Bubble sort.
 * 冒泡排序
 * @param <E> the type parameter
 */
public class BubbleSort<E extends Comparable> implements SortMethodable<E> {
    @Override
    public List<E> sort(List<E> list) {
        int length = list.size();
        if (length <= 1) {
            return list;
        }
        for (int i = 0; i < length; i++) {
            //一个标识符 如果中途有一次没有移动元素 说明list已经有序 则停止循环
            Boolean flag = false;
            for (int j = 0; j < (length - i - 1); j++) {
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                    E temp = list.get(j + 1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return list;
    }
}
