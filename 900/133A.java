import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();
        String out="HQ9";

        for(char c:s){
            if(out.indexOf(c)!=-1){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}