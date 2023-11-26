import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            int t=a;a=b;b=t;
        }
        
        System.out.println(a+" "+(b-a)/2);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}