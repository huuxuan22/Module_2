package phan_1;
import java.util.Scanner;
public class UngDungChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = convertNumberToWords(number);
            System.out.println(result);
        }
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String[] ones = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        String[] teens = {
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String result = "";

        if (number / 100 > 0) {
            result += ones[number / 100] + " hundred";
            number %= 100;
            if (number > 0) {
                result += " and ";
            }
        }

        if (number >= 20) {
            result += tens[number / 10];
            if (number % 10 > 0) {
                result += " " + ones[number % 10];
            }
        } else if (number >= 10) {
            result += teens[number - 10];
        } else if (number > 0) {
            result += ones[number];
        }

        return result;
    }
}
