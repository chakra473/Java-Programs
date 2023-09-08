package MultiThreading;
class Hi extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Hello extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello hello=new Hello();
        hi.start();
        hello.start();

    }
}
