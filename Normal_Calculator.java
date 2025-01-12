// Normal calculator
import java.util.Scanner;
public class Normal_Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an first num: ");
        int num1 = in.nextInt();
        System.out.print("Enter an operation: ");
        char operation = in.next().charAt(0);
        System.out.print("Enter an second num: ");
        int num2 = in.nextInt();
        switch (operation) {
            case '+':
                int a = num1 + num2;
                System.out.println(a);
                break;
                case '-':
                    int b = num1 - num2;
                    System.out.println(b);
                    break;
                    case '*':
                        int c = num1 * num2;
                        System.out.println(c);
                        break;
                        case '/':
                            int d = num1 / num2;
                            System.out.println(d);
                            break;
                            case '%':
                                int e = num1 % num2;
                                System.out.println(e);
                                break;
        }
    }
    
}
