import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        String b = cin.next();
        int c = (a-1000) / 500;
        int sum = 8;
        if ((a - c * 500 - 1000) > 0){
            c = c + 1;
        }
        if (b.equals("y")){
            if (a <= 1000){
                sum = 13;
            }
            else {
                sum += c * 4 + 5;
            }
        }
        System.out.println(sum);
    }
}
