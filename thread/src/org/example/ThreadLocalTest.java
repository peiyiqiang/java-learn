package org.example;

public class ThreadLocalTest implements Runnable {

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        //coding here
        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());

        threadLocal.set(50);

        ThreadLocalTest tlt = new ThreadLocalTest();
        new Thread(tlt).start();

        System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
    }
}
