package Multithreading;

public class squareThread extends Thread{
    public int n;
    public squareThread(int n){
        this.n=n;
        System.out.println("Square thread started");
        start();
    }
    public void run(){
        System.out.println("The square of the Random number"+n+"is"+(n*n));
    }
}