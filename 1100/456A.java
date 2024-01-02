import java.util.*;
 
public class Main{
 
    static void solve(){
        int n=sc.nextInt();

        boolean f1=false,f2=false;
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt();

            if(a>b)f1=true;
            if(a<b)f2=true;
        }
        if(f1 && f2)System.out.println("Happy Alex");
        else System.out.println("Poor Alex");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}
