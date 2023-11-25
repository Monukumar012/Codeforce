import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int t=sc.nextInt();
        char s[]=sc.next().toCharArray();
        while(t-->0){
            for(int i=0;i<n-1;i++){
                if(s[i]=='B' && s[i+1]=='G'){
                    s[i]='G';
                    s[i+1]='B';
                    i++;
                }
            }
        }
        System.out.println(new String(s));
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}