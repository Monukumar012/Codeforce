import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            max=Math.max(max, x);
            sum+=x;
        }
        System.out.println((max*n)-sum);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}