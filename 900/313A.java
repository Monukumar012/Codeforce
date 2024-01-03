import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();

        // if(n<0){
        //     String s=Integer.toString(n);
        //     int len=s.length();
        //     int val1=Integer.parseInt(s.substring(0, len-1));
        //     int val2=Integer.parseInt(s.substring(0, len-2)+s.substring(len-1));
        //     n=Math.max(val1, val2);
        // }

        if(n<0){
            int last=n%10,secLast=(n%100)/10;
            
            n=n-n%100;
            if(last>secLast) n+=10*last;
            else n+=10*secLast;
            
            n/=10;
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