import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();
        
        StringBuilder sb=new StringBuilder();
        for(char c:s){
            if("AEIOUYaeiouy".indexOf(c)==-1){
                if(c<'a')c+=32;
                sb.append('.');
                sb.append(c);
            }
        }
        System.out.println(sb);
        
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}