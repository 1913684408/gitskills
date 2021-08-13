import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char ch[] = new char[255];
        int count = 0;
        for (int i = 0;i < str.length();i++){
            ch[i] = str.charAt(i);
        }
        for (int i = 0;i < str.length();i++){
            if (ch[i] >= '0' && ch[i] <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
