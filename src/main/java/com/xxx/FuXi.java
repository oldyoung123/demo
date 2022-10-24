package com.xxx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FuXi {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.forEach( o -> System.out.println(o));
        System.out.println(123);
        System.out.println(456);
        System.out.println(789);


    }
}
