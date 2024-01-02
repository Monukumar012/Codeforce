import java.util.*;
 
public class Main{
 
    static void solve(){
        int a=sc.nextInt();

        if(360%(180-a)==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}
