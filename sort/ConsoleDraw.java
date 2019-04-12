/*
 * Copyright (c) 2019. Zhangrb write this code. If any question mail mrzhangrb@outlook.com
 */

package com.algorithm.sort;

import java.util.Collections;
import java.util.List;

class ConsoleDraw1<E extends List> implements Drawableb<E>{
    @Override
    public void draw(E list) {
        System.out.println("draw");
    }
}


interface Drawableb <E> {
    void draw(E list);
}

/**
 * @param <E>
 */
interface Drawable<E> {
    void draw(List<E> list);

    void clear();
}

public class ConsoleDraw<E extends Comparable> implements Drawable<E> {
    private String pattern = "*";
    @Override
    public void draw(List<E> list) {
        clear();
        int max = Collections.max((List<Integer>) list);
        int length = list.size();
        String[][] paper = new String[length][max];
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < length; i++) {
                if ((j + (Integer) list.get(i)) >= max) {
                    paper[i][j] = pattern;
                    System.out.print(pattern + "\t");
                } else {
                    paper[i][j] = "  ";
                    System.out.print("  \t");
                }
            }
            System.out.println("");
        }
        try {
            Thread.sleep(500);
        }catch (Exception ex){

        }
    }

    @Override
    public void clear() {
        for (int z = 30; z > 0; z--) {
            System.out.println("");
        }
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}