import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=i+1;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int i=0,j=0,k=0;
        while(i<n && arr[i][0]!=1)i++;
        while(j<n && arr[j][0]!=2)j++;
        while(k<n && arr[k][0]!=3)k++;

        List<String> list=new ArrayList<>();
        while(i<n && j<n && k<n){
            if(arr[i][0]!=1 || arr[j][0]!=2 || arr[k][0]!=3)break;
            String s=arr[i++][1]+" "+arr[j++][1]+" "+arr[k++][1];
            list.add(s);
        }
        System.out.println(list.size());
        for(String s:list){
            System.out.println(s);
        }
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}