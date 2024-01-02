import java.util.*;
 
public class Main{
 
    static void solve(){
        int n=sc.nextInt();
        int c1=0,c2=0,ans=0;
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            if(ele==1)c1++;
            else if(ele==2)c2++;
            else if(ele==3){
                ans++;
                c1--;
            }
            else ans++;
        }
        if(c1<0)c1=0;
        c1+=(2*c2);
        ans+=(int)Math.ceil(c1/4.0);
        System.out.println(ans);
    }
 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}