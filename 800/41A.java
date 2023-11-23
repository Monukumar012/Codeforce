import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        StringBuilder t=new StringBuilder(sc.next());
        if(s.equals(t.reverse().toString())) System.out.println("YES");
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}