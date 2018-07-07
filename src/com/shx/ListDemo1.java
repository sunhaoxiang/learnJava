package com.shx;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

    public void listDemo() {
        List list = new ArrayList();
        list.add("Java");
        list.add("JavaScript");
        list.add("C");
        list.add("Swift");
        list.add("Go");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ",");
        }

        System.out.println();

        list.remove(2);

    }

}
