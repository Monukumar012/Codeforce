import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt()+1, m=sc.nextInt();
        
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
           arr[i]=sc.nextInt();
        }

        long ans=0,pos=1;
        for(int i=0;i<m;i++){

            if(pos==arr[i])continue;

            if(pos>arr[i]){
                ans+=(n-pos)+(arr[i]-1L);
            }
            else ans+=(arr[i]-pos);
            pos=arr[i];
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