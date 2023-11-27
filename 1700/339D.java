import java.util.*;



public class Main{


    public static int tree[];
    
    public static void build(int ind, int low, int high, boolean isOr,int arr[]){
        if(low==high){
            tree[ind]=arr[low];
            return;
        }

        int mid=(low+high)/2;
        build(2*ind+1, low, mid, !isOr, arr);
        build(2*ind+2, mid+1, high, !isOr, arr);

        if(isOr){
            tree[ind]=tree[2*ind+1] | tree[2*ind+2];
        }
        else{
            tree[ind]=tree[2*ind+1] ^ tree[2*ind+2];
        }
    }

    public static void update(int ind, int low, int high, boolean isOr,int i, int val){
        if(low==high){
            tree[ind]=val;
            return;
        }

        int mid=(low+high)/2;
        if(i<=mid)update(2*ind+1, low, mid, !isOr, i, val);
        else update(2*ind+2, mid+1, high, !isOr, i, val);

        if(isOr){
            tree[ind]=tree[2*ind+1] | tree[2*ind+2];
        }
        else{
            tree[ind]=tree[2*ind+1] ^ tree[2*ind+2];
        }
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt(),m=sc.nextInt();

        int N=1<<n;
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        tree=new int[4*N];

        build(0, 0, N-1, n%2!=0, arr);
        // System.out.println(seg.tree[0]);

        for(int i=0;i<m;i++){
            int ind=sc.nextInt()-1;
            int val=sc.nextInt();
            update(0, 0, N-1, n%2!=0, ind, val);
            System.out.println(tree[0]);
        }

    }
}