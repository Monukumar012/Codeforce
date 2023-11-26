import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c)));
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}