import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int min=10001,max=0,cnt=0;
        while(n-->0){
            int x=sc.nextInt();
            if(x>max || x<min)cnt++;

            min=Math.min(x,min);
            max=Math.max(x,max);
        }
        System.out.println(cnt-1);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}