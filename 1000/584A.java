import java.util.*;

public class Main{

    static void solve(){
        long n=sc.nextLong(), t=sc.nextLong();

        StringBuilder ans=new StringBuilder();
        if(n==1 && t==10)ans.append(-1);
        else{
            ans.append(t);
            int i=t==10 ? 2 : 1;
            for(;i<n;i++){
                ans.append(0);
            }
        }
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}