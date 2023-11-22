import java.util.*;

public class Main{

    static void solve(){
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int i=0,n=a.length();
        while(i<n){
            if(a.charAt(i)>b.charAt(i)){
                System.out.println(1);
                return;
            }
            if(a.charAt(i)<b.charAt(i)){
                System.out.println(-1);
                return;
            }
            i++;
        }
        System.out.println(0);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}