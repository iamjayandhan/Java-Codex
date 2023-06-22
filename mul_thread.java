import java.util.*;
public class mul_thread{
    public static void main(String args[]){
        RandThread r = new RandThread();
    }
} 

class SquareThread extends Thread{
    public int n;
    public SquareThread(int no){
        this.n=no;
        System.out.println("Square Thread Started");
        start();
    }
    public void run(){
        System.out.println("The square of the random number"+n+"is"+(n*n));
    }
}

class CubeThread extends Thread{
    public int n;
    public CubeThread(int no){
        this.n=no;
        System.out.println("Cube Thread started");
        start();
    }
    public void run(){
        System.out.println("The cube of the random number"+n+"is"+(n*n*n));
    }
}

class RandThread extends Thread{
    public RandThread(){
        start();
    }
    public void run(){
        int v=0;
        Random r = new Random();
        try{
            for(int i=1;i<=10;i++){
                v=r.nextInt(100);
                System.out.println("Generated random number is"+v);
                if (v%2==0)
                    new SquareThread(v);
                else
                    new CubeThread(v);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Random number thread interrupted");
        }
    }
}

