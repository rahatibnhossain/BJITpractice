package co.bjit.practice;

public class TimeComplex {
    public static void main(String args[]){
        double now = System.currentTimeMillis();
        TimeComplex tc = new TimeComplex();

        tc.findSum(99999);
        System.out.println("Time taken " +(System.currentTimeMillis()-now));
    }

    public void findSum(int n){
        int sum =0;
//        for(int i=0;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        System.out.println(n*(n-1)/2);

    }
}
