import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int off=0,crime=0;
        while(n-->0){
            int x=sc.nextInt();
            if(x>=0)off+=x;
            else {
                if(off==0)crime++;
                else off--;
            }
        }
        System.out.println(crime);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}