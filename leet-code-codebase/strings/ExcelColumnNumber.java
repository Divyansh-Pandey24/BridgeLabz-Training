import java.util.Scanner;

public class ExcelColumnNumber {

    public static int titleToNumber(String columnTitle) {

        int col = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            col = col * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return col;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Excel Column Title (e.g., A, AB, ZY): ");
        String columnTitle = sc.next();

        int result = titleToNumber(columnTitle);

        System.out.println("Column Number = " + result);

        sc.close();
    }
}
