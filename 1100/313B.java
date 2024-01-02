import java.util.*;
 
public class Main{
 
    static void solve(){
        char s[]=sc.next().toCharArray();
        int n=s.length;
        int pre[]=new int[n];

        for(int i=1;i<n;i++){
            if(s[i]==s[i-1])pre[i]++;
            pre[i]+=pre[i-1];
        }
        int m=sc.nextInt();

        StringBuilder ans=new StringBuilder();
        while(m-->0){
            int l=sc.nextInt()-1,r=sc.nextInt()-1;
            ans.append(pre[r]-pre[l]).append("\n");
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
