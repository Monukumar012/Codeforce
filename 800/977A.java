import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int k=sc.nextInt();
        while(k-->0){
            if(n%10==0)n/=10;
            else n--;
        }
        System.out.println(n);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}