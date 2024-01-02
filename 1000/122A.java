import java.util.*;

public class Main{

    static boolean f(int n, String d){
        int dd=Integer.parseInt(d);
        if(dd>n)return false;
        if(n%dd==0)return true;

        return f(n,d+'4') || f(n,d+'7');
    }
    static void solve(){
        int n=sc.nextInt();

        if(f(n,"4") || f(n,"7")){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}