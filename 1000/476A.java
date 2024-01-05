import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(), m=sc.nextInt();
        int move=-1;
        if(n>=m){
            move=(n+1)/2;
            if(move%m!=0)move+=m-move%m;
        }
        System.out.println(move);

    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}