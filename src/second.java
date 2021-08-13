import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int d[]=new int[26];
        int e[]=new int[26];
             int i,lenB,lenC;
             int temp1,temp2;
             int flag;
            Scanner cin = new Scanner(System.in);
            String a = cin.next();
        String b = cin.next();
        String c = cin.next();

             for(i=0;i<26;i++) d[i]=-1;

             lenB=b.length();
             flag=0;
             for(i=0;i<lenB;i++)
                 {
                     temp1=a.charAt(i)-'A';
                     temp2=b.charAt(i)-'A';
                     if(d[temp2]==-1||d[temp2]==temp1) d[temp2]=temp1;
                     else
                     {
                             flag=1;
                             break;
                         }
                 }
             for(i=0;i<26;i++)
                     if(d[i]==-1)
                     {
                         flag=1;
                         break;
                     }
             if(flag==1)
                 {
                     System.out.println("Failed");
                 }
             else
             {
                     for(i=0;i<26;i++) e[d[i]]=i;   //扫描明文映射表d，生成密文映射表e.
                     lenC=c.length();
                     for(i=0;i<lenC;i++)//解密c字符串
                         {
                             System.out.print(e[c.charAt(i)-'A']+'A');
                         }
                     System.out.println();
                 }
    }
}