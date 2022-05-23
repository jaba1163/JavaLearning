package Threads.chap01SimpleThreads;

public class ThreadClassDemo01
{
    public static void main(String args[])
    {
        MyClass th = new MyClass();
        th.start();
        MyClass th1 = new MyClass();
        th1.start();
    }
}

class MyClass extends Thread{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
        System.out.println(Thread.currentThread().getName() + " || "
        +Thread.currentThread().getId() + " || " + "I love Threads.");
        }
    }
}