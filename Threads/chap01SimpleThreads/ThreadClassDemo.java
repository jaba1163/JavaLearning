package Threads.chap01SimpleThreads;

public class ThreadClassDemo
{
    public static void main(String args[])
    {
        MyClass th = new MyClass();
        th.start();
    }
}

class MyClass extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " || "
        +Thread.currentThread().getId() + " || " + "I love Threads.");
    }
}