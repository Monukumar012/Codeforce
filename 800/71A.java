import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        int n=s.length();

        if(n>10){
            System.out.println(s.charAt(0)+""+(n-2)+""+s.charAt(n-1));
        }
        else System.out.println(s);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}