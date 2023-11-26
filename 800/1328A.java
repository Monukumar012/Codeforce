import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=(int)Math.ceil((double)a/b)*b-a;

        System.out.println(ans);

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}