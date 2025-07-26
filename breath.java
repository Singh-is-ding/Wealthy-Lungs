package stopwatch;
import java.util.Scanner;
class breath extends Thread{
    int m;
    public breath(int m){
        this.m=m;;}
    public void run(){
        int count=1;
        while (count<=m){
            System.out.println(count++);
            try {
                Thread.sleep(1000);}
            catch (Exception e){}
            if(count==30) {
                    System.out.println("AVG LUNGS");
                }
                if(count==45) {

                        System.out.println("ABOVE AVG LUNGS");
                    }
            }

        try{}
        finally {
            System.out.println("EXCELLENCE");
        }
    }
}
class stopwatchh{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter time for stop");
        n=sc.nextInt();
        breath mm=new breath(n);
        mm.start();


    }


}

