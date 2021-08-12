import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        char ch[] = new char[13];
        int sum = 0;
        int count = 1;
        for (int i = 0;i < ch.length;i++){
            ch[i] = 0;
        }
        Scanner cin = new Scanner(System.in);
        String a = cin.next();
        for (int i = 0;i < a.length();i++){
            ch[i] = a.charAt(i);
        }
        for (int i = 0;i < a.length() - 1;i++){
            if (ch[i] >= '0' && ch[i] <= '9'){
                sum += (ch[i] - '0') * count;
                count++;
            }
        }
        if (sum % 11 == ch[12] - '0'){
            System.out.println("Right");
        }
        else if (sum % 11 == 10){
            if (ch[12] == 'x'){
                System.out.println("Right");
            }
        }
        else {
            for (int i = 0;i < ch.length - 1;i++){
                System.out.print(ch[i]);
            }
            if (sum % 11 == 10){
                System.out.println("x");
            }
            else {
                System.out.println(sum % 11);
            }
        }
    }
}
