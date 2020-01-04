package com.ludashen.kouyumain;

/**
 * @description:
 * @author: 陆均琪
 * @Data: 2019-12-25 23:27
 */
public class Order {
    private int id;
    private A a;
    private B b;
    private Title title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
