import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        char s[]=sc.next().toCharArray();

        // Stack<Character> st=new Stack<>();
        // int cnt=0;
        // for(char c:s){
        //     if(c=='(')st.push(c);
        //     else{
        //         if(!st.isEmpty() && st.peek()=='(')st.pop();
        //         else cnt++;
        //     }
        // }

        int ans=0,cnt=0;
        for(char c:s){
            if(c=='(')cnt++;
            else cnt--;
            if(cnt<0){
                ans+=(-cnt);
                cnt=0;
            }
        }
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}