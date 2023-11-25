import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int grp=0,pre=010;
        while(n-->0){
            int x=sc.nextInt();
            if(pre!=x)grp++;
            pre=x;
        }
        System.out.println(grp);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}