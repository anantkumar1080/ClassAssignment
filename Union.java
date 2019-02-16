import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        int[] arr1=new int[m];

        for(int i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        int n=sc.nextInt();
        int[] arr2=new int[n];
        int[] arr3=new int[m+n];
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        for(int i=0;i<m;i++){
            arr3[i]=arr1[i];
        }
        int k=0;
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<m;j++)
            {
                if(arr2[i]==arr1[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                arr3[n+k]=arr2[i];
                k++;
            }
        }
        for(int i=0;i<(m+k);i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
//1263
//1259
//1233