import java.util.*;

public class Main{

    static void solve(){
        int k=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<=10;i++){
            int d=(k*i)%10;
            if(d==r || d==0){
                System.out.println(i);
                return;
            }
        }
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}