import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        int n=s.length(),ind=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a'){
                ind=i;
            }
        }
        if(ind==0){
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase());
        }
        else if(ind==-1)System.out.println(s.toLowerCase());
        else System.out.println(s);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}