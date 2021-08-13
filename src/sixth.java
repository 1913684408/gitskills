import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.next();
        String b = cin.next();
        String c = cin.next();
        int count = 0;
        for (int i = 0;i < c.length();i++){
            for (int j = 0;j < b.length();j++){
                if (c.charAt(i) != b.charAt(j)){
                    count = 1;
                }
                else {
                    count = 0;
                    break;
                }
            }
            if (count == 1){
                System.out.println("Failed");
                System.exit(0);
            }
        }
        for (int i = 0;i < a.length();i++){
            for (int j = i+1;j < a.length();j++){
                if (a.charAt(i) == a.charAt(j)){
                    if (b.charAt(i) != b.charAt(j)){
                        System.out.println("Failed");
                        System.exit(0);
                    }
                }
                if (b.charAt(i) == b.charAt(j)){
                    if (a.charAt(i) != a.charAt(j)){
                        System.out.println("Failed");
                        System.exit(0);
                    }
                }
            }
        }
        int number[] = new int[26];
        for (int i = 0;i < b.length();i++){
            number[b.charAt(i)-'A'] += 1;
        }
        for (int i = 0;i < number.length;i++){
            if (number[i] == 0){
                System.out.println("Failed");
                System.exit(0);
            }

        }
        for (int i = 0;i < c.length();i++){
            int index = -1;
            for (int j = 0;j < b.length();j++){
                if (c.charAt(i) == a.charAt(j)){
                    index = j;
                }
            }
            System.out.print(b.charAt(index));
        }
    }
}
