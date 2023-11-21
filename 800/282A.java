import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int x=0;
        while(n-->0){
            String s=sc.next();
            if(s.indexOf('+')!=-1)x++;
            else x--;
        }
        System.out.println(x);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}