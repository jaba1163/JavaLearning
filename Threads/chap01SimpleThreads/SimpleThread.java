package Threads.chap01SimpleThreads;

//simple thread
public class SimpleThread implements Runnable
{

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("I love threads. := " + i);
        }
    }

public static void main(String args[])
{
    System.out.println("In main thread - begin");
    SimpleThread simpleThread =  new SimpleThread();
    simpleThread.run();
    System.out.println("In main thread - end");
}
    
}