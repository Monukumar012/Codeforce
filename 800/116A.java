import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int max=0,curr=0;
        while(n-->0){
            curr-=sc.nextInt();
            curr+=sc.nextInt();
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}