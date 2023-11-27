import java.util.*;

public class Main{

    static void solve(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==b && b==c){
            System.out.println(1+" "+1+" "+1);
        }
        else {
            int max=Math.max(a,Math.max(b,c));
            if(a==max){
                System.out.println(1+" "+0+" "+0);
            }
            else if(b==max){
                System.out.println(0+" "+1+" "+0);
            }
            else{
                System.out.println(0+" "+0+" "+1);
            }
        }
        
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}