import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        char c=s.charAt(0);
        if(c>='a')c=(char)((int)c-32);
        System.out.print(c+s.substring(1));
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}