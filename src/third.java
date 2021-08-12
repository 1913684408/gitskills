import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int arr[] = new int[50001];
        int n,i,j,m;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        int flag=0;
        for(i=1;i<=n;i++)
        {
            arr[i]=1;
        }
        for(i=1;i<=m;i++)
        {
            for(j=i;j<=n;j=j+i)
            {
                arr[j]=-1*arr[j];
            }
        }
        for(i=1;i<=n;i++)
        {
            if (arr[i]==-1)
            {
                if(flag==0)
                {
                    System.out.print(i);
                    flag=1;
                }
                else
                {
                    System.out.print("," + i);
                }
            }
        }
    }
}
