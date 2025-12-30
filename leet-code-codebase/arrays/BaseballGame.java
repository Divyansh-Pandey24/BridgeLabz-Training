import java.util.Scanner;

public class BaseballGame {

    public static int calPoints(String[] ops) {

        int[] s = new int[ops.length];
        int i = 0;

        for (String op : ops) {
            switch (op) {
                case "C":
                    i--;
                    break;

                case "D":
                    s[i] = 2 * s[i - 1];
                    i++;
                    break;

                case "+":
                    s[i] = s[i - 1] + s[i - 2];
                    i++;
                    break;

                default:
                    s[i++] = Integer.parseInt(op);
            }
        }

        int sum = 0;
        for (int k = 0; k < i; k++)
            sum += s[k];

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        sc.nextLine();  

        String ops[] = new String[n];

        System.out.println("Enter the operations (values / + / D / C):");
        for (int i = 0; i < n; i++) {
            ops[i] = sc.nextLine();
        }

        int result = calPoints(ops);

        System.out.println("Total Score = " + result);

        sc.close();
    }
}
