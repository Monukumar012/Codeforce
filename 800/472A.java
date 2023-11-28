import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        
        if(n%2==0){
            System.out.println(4 + " " + (n-4));
        }
        else System.out.println(9 + " " + (n-9));
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}