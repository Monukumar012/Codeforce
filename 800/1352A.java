import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int cnt=0;
        List<Integer> ans=new ArrayList<>();
        while(n>0){
            int d=n%10;
            if(d!=0){
                int x=(int)(d*Math.pow(10,cnt));
                ans.add(x);
            }
            n/=10;cnt++;
        }
        System.out.println(ans.size());
        for(int e:ans)System.out.print(e+" ");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}