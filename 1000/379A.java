import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(), b=sc.nextInt();

        int ans=n;
        while((n/b)>0){
            ans+=n/b;
            n=(n/b)+(n%b);
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