class MyThread extends Thread
{
    public void run(){
        try {
        
        System.out.println("Thread class extended");    Thread.sleep(10);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
        
    }

class MyRun implements Runnable
{
        public void run(){
            System.out.println("Runnable interface implemented");
        }
            
    }

public class Test{
    public static void main(String[] args) {
        MyThread objMyThread =new MyThread();
        MyRun objMyRun = new MyRun();
        
        Thread t2 = new Thread(objMyRun);
        objMyThread.start();
        t2.start();
        
    }
.}
