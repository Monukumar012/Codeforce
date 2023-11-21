import java.util.*;

public class Main{

    static void solve(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(sc.nextInt()==1){
                    int move=(Math.abs(2-i)+Math.abs(2-j));
                    System.out.println(move);
                    return;
                }
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