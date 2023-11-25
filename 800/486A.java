import java.util.*;

public class Main{

    static void solve(){
        long n=sc.nextLong();
        long ans=0;
        if(n%2==0)ans=n/2;
        else ans=((n+1)/2)*-1;

        System.out.println(ans);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}