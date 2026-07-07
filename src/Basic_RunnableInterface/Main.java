package Basic_RunnableInterface;

public class Main {
    public static void main(String[] args) {
        MyThread dt1=new MyThread();
        Thread t1=new Thread(dt1);
        t1.start();
        for(int i=0;i<1000;i++){
            System.out.println("DHOLU BHOLU");
        }
    }
}
