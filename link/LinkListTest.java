package com.algorithm.link;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author zrb
 */
public class LinkListTest {
    public static void main(String[] args){
        LinkList<Integer> list = new LinkList<>();
        list.add(5);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        System.out.println(list.toArray(new Object[5]).length);
    }
}

//class LinkNode
