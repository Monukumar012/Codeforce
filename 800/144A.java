import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();

        int min=101,minInd=-1, max=-1,maxInd=-1;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(min>=a){
                min=a;
                minInd=i;
            }
            if(max<a){
                max=a;
                maxInd=i;
            }
        }
        n--;
        int cnt=(n-minInd)+maxInd;
        if(minInd<maxInd)cnt--;
        System.out.println(cnt);

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}