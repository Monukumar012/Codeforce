import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        while(n-->0){
            if(sc.nextInt()==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}