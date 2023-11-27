import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=(int)Math.ceil(Math.abs(a-b)/10.0);
        System.out.println(ans);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}