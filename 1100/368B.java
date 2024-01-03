import java.util.*;
 
public class Main{
 
    static void solve(){
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();

        int suf[]=new int[n];

        Set<Integer> set=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            set.add(arr[i]);
            suf[i]=set.size();
        }

        StringBuilder ans=new StringBuilder();
        while(m-->0){
            int curr=suf[sc.nextInt()-1];
            ans.append(curr).append("\n");
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
