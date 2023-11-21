import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();

        if(n<=2)System.out.println("NO");
        else if(n%2==0)System.out.println("YES");
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}