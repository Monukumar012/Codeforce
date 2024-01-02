import java.util.*;
 
public class Main{
 
    static void solve(){
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n+1];

        int min=(int)1e9,ind=1;
        for(int i=1;i<=n;i++){
            arr[i]=+arr[i-1]+sc.nextInt();
            
            if(i>=k){
                int curr=arr[i]-arr[i-k];
                if(curr<min){
                    min=curr;
                    ind=i-k+1;
                }
            }
        }
        
        System.out.println(ind);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}
