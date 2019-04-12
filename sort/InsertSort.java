/*
 * Copyright (c) 2019. Zhangrb write this code. If any question mail mrzhangrb@outlook.com
 */

package com.algorithm.sort;

import java.util.List;

public class InsertSort<E extends Comparable> implements SortMethodable<E> {
    @Override
    public List<E> sort(List<E> list) {
        int len = list.size();
        if (list.size() <= 1) {
            return list;
        }
        for (int p = 1; p < len; p++) {
            E val = list.get(p);
            int q = p - 1;
            //或查找输入位置
            for (; q > 0; q--) {
                if (list.get(q).compareTo(val) == 1) {
                    list.set(q + 1, list.get(q));
                } else {
                    break;
                }
            }
            //插入数据
            list.set(q + 1, val);
        }
        return list;
    }
}
