import java.util.*;

public class Main{

    static void solve(){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<4;i++){
            set.add(sc.nextInt());
        }
        System.out.println(4-set.size());

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}