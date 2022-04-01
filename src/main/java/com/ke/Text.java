package com.ke;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fsy\zxy/
 * @create 2022-03-24 11:14
 */
public class Text {
    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        f.sum();
    }
}

class Fibonacci{
    void sum(){

        int sum = 0;
        List Flist = new ArrayList();
        Flist.add(0,1);
        Flist.add(1,1);

        for (int i = 2;i <= 39;i++){
            int s = (Integer) Flist.get(i - 1) + (Integer) Flist.get(i - 2);
            Flist.add(i, s);
        }

        for (Object o : Flist) {
            sum += (Integer)o;
        }
        System.out.println(sum);
    }


    public void GitTest1(){

        System.out.println("he!");
        System.out.println("he!");
        System.out.println("he!");
        System.out.println("he!");
        System.out.println("master commit1");
        System.out.println("master commit1");
    }
}