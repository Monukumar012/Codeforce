import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int max=0,pre=0;
        for(int i=0;i<n;i++){
            int y=sc.nextInt();
            max=Math.max(max,y-pre);
            pre=y;
        }
        max=Math.max(max,2*(x-pre));
        System.out.println(max);

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}