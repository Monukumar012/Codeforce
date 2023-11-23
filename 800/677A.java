import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int h=sc.nextInt();
        int ans=0;
        while(n-->0){
            if(sc.nextInt()>h)ans++;
            ans++;
        }
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}