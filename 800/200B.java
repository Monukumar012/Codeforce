import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextDouble();
        }
        sum=sum/n;
        System.out.println(sum);
        // System.out.printf("%.12f", sum);

        
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}