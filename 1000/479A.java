import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();

        int ans=Math.max(a*b*c, Math.max((a+b)*c,Math.max(a*(b+c),a+b+c)));
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}