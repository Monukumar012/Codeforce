import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int cnt=0;
        while(n-->0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if((q-p)>=2)cnt++;
        }
        System.out.println(cnt);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}