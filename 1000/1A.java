import java.util.*;

public class Main{

    static void solve(){
        double n=sc.nextDouble(),m=sc.nextDouble(),a=sc.nextDouble();
        long xDir=(long)Math.ceil(n/a);
        long yDir=(long)Math.ceil(m/a);
        System.out.println(xDir*yDir);
        
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}