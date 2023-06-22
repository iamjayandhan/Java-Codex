package Multithreading;

import java.util.Random;

public class RandThread extends Thread{
    public RandThread(){
        start();
    }
    public void run(){
        int v=0;
        Random r = new Random();
        try{
            for(int i=0;i<=10;i++){
                v = r.nextInt(100);
                System.out.println("Generated Random Number is"+v);
                if(v%2==0)
                    new squareThread(v);
                else
                    new cubeThread(v);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Random Number Thread Interrupted");
        }
    }
}
