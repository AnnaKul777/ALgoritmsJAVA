package org.example.Seminar3;

public class Main {
    public static void main(String[] args) {
        LinList list = new LinList();
        list.addElements(1);
        list.addElements(0);
        list.addElements(2);
        list.addElements(5);
        list.addElements(10);
        list.print();
        list.revert();
        System.out.println();
        list.print();

    }

}
