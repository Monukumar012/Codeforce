import java.util.*;

public class Main{

    static void solve(){
        double k=(double)sc.nextInt();
        double n=(double)sc.nextInt();
        double w=(double)sc.nextInt();
        double cost = (2*k+(w-1)*(2*k-k))*(w/2);

        System.out.print((int)Math.max(0,cost-n));
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}