package com.algorithm;

public class LinkedListTest {

    public static void main(String[] args) {
	    LinkNode<Integer> node = new LinkNode<>();
	    node.setVal(45);
	    LinkList<Integer> list = new LinkList<>(node);
	    list.add(5443);
	    list.add(6534);
	    list.prettyPrint();
    }
}

class LinkNode <E> {
    LinkNode next = null;
    E val;

    public void setVal(E val) {
        this.val = val;
    }
}

class LinkList <E> {
    LinkNode <E> head;
    private int len;

    public LinkList(LinkNode<E> head) {
        this.head = head;
    }

    public int getLen() {
        return len;
    }

    public LinkNode<E> add(E val){
        LinkNode<E> p = head;
        while(p.next != null){
            p = p.next;
        }
        LinkNode<E> added = new LinkNode<>();
        added.setVal(val);
        p.next = added;
        return added;
    }

    public void prettyPrint(){
        LinkNode<E> p = head;
        while(p != null){
            System.out.print(p.val + "->");
            p = p.next;
        }
    }
}
