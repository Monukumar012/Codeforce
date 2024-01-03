import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(),m=sc.nextInt();
        
        // int cut=n*m;
        // boolean ak=false;

        // while(cut>0){
        //     cut-=(n+m-1);
        //     --n;--m;
        //     ak =!ak;
        // }

        // if(ak)System.out.println("Akshat");
        // else System.out.println("Malvika");
        
        int min=Math.min(n,m);
        System.out.println(min%2==0 ? "Malvika" : "Akshat");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}