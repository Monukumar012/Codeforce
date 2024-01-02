import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();
        int n=s.length;
        int cnt=0;
        char pre=s[0];

        for(char c:s){
            if(c==pre){
                cnt++;
                if(cnt>=7){
                    System.out.println("YES");
                    return;
                }
            }
            else{
                cnt=1;pre=c;
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