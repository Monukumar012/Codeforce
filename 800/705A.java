import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt()-1;
        String ans="I hate",love=" I love",hate=" I hate";
        boolean f=true;
        while(n-->0){
            if(n>=0)ans+=" that";

            if(f)ans+=love;
            else ans+=hate;
            f=!f;

        }
        System.out.println(ans+" it");

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}