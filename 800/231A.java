import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int ans=0;
        while(n-->0){
            int cnt=0;
            for(int i=0;i<3;i++){
                cnt+=sc.nextInt();
            }
            if(cnt>1)ans++;
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