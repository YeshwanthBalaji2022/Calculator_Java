import java.util.Scanner;
import java.io.IOException;
public class CalciWithIfStatements {
    public static void main(String[]args) throws IOException{
        Scanner CalciWithIfStatements = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = CalciWithIfStatements.nextInt();
        System.out.println("Enter value of b");
        int b = CalciWithIfStatements.nextInt();
        System.out.println("Enter operation");
        char ch = (char)System.in.read();
        int ans;
        if (ch=='+'){
            ans = a+b;
            System.out.println(ans);
        }
        else if (ch=='-'){
            ans = a-b;
            System.out.println(ans);
        }
        else if (ch=='*'){
            ans = a*b;
            System.out.println(ans);
        }
        else if (ch=='/'){
            ans = a/b;
            System.out.println(ans);
        }
        else if (ch=='%'){
            ans = a%b;
            System.out.println(ans);
        }
    }
}
