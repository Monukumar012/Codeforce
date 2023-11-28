import java.util.*;

public class Main{

    static List<Integer> li=new ArrayList<>();
    static int num=1;
    static void solve(){
        int k=sc.nextInt();

        while(li.size()<k){
            if(num%3!=0 && num%10!=3)li.add(num);
            num++;
        }
        System.out.println(li.get(k-1));
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}