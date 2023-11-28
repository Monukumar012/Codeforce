import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int k=5-sc.nextInt();
        
        int cnt=0;
        while(n-->0){
            if(sc.nextInt()<=k)cnt++;
        }
        System.out.println(cnt/3);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}