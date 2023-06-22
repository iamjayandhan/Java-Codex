package Multithreading;

public class cubeThread extends Thread{
    public int n;
    public cubeThread(int n){
        this.n=n;
        System.out.println("Cube thread started");
        start();
    }
    public void run(){
        System.out.println("Cube of the Random Number"+n+"is"+(n*n*n));
    }
}
