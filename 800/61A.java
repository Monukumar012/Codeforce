import java.util.*;

public class Main{

    static void solve(){
        char s1[]=sc.next().toCharArray();
        char s2[]=sc.next().toCharArray();
        String ans="";
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i])ans+='1';
            else ans+='0';
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