import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();
        int n=s.length;
        String ans="";

        for(int i=0;i<n;i++){
            if(s[i]=='.')ans+='0';
            else{
                if(s[i+1]=='-')ans+='2';
                else ans+='1';
                i++;
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