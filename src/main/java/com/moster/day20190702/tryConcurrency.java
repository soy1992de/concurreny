package com.moster.day20190702;

public class tryConcurrency {

    public static void main(String[] args) {
        Thread t1= new Thread("customer"){

            @Override
            public void run() {
                try {
                    Thread.sleep(10000000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("customer....");
            }
        };

        Thread t2=new Thread("provider"){
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("provider.....");
                }
        };

        t1.start();
        t2.start();

        System.out.println("main is ending....");
    }
}
