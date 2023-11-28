import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();

        int sum=0;
        for(int i=0;i<3;i++){
            sum+=s[i]-s[5-i];
        }
        if(sum==0)System.out.println("YES");
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}