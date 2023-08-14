import java.util.Scanner;
import java.io.IOException;

public class CalciWithSwitchStatements {
    public static void main(String[] args) throws IOException {
        Scanner CalciWithSwitchStatements = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = CalciWithSwitchStatements.nextInt();
        System.out.println("Enter value of b");
        int b = CalciWithSwitchStatements.nextInt();
        System.out.println("Enter operation");
        char ch = (char) System.in.read();
        int ans;
        switch (ch) {
            case '+':
                ans = a + b;
                System.out.println(ans);
                break;
            case '-':
                ans = a - b;
                System.out.println(ans);
                break;
            case '*':
                ans = a * b;
                System.out.println(ans);
                break;
            case '/':
                ans = a / b;
                System.out.println(ans);
                break;
            case '%':
                ans = a % b;
                System.out.println(ans);
                break;
        }
    }
}
