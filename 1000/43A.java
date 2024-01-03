import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans="";int max=0;
        for(String k:map.keySet()){
            if(max<map.get(k)){
                ans=k;
                max=map.get(k);
            }
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