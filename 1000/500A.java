import java.util.*;

public class Main{

    static boolean dfs(int u, List<List<Integer>> adj, int dest){
        if(u==dest)return true;

        for(int v:adj.get(u)){
            if(dfs(v,adj,dest))return true;
        }
        return false;
    }
    static void solve(){
        int n=sc.nextInt(),t=sc.nextInt();

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)adj.add(new ArrayList<>());

        for(int i=1;i<n;i++){
            adj.get(i).add(i+sc.nextInt());
        }
        
        if(dfs(1,adj,t))System.out.println("YES");
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}