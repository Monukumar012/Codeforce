import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int ans=0;
        if(n>2)ans=(n-1)/2;
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}