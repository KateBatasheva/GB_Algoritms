package lesson3;

import java.util.Scanner;

public class ReWrite {

    private MyStack reW;
    private Scanner scanner;
    private StringBuilder sb;
    private String str;
    private String[] str2;

    public ReWrite() {
        reW = new MyStack();
        scanner = new Scanner(System.in);
        sb = new StringBuilder();

    }

    public String read() {
        str = scanner.nextLine();
        str2 = str.split(" ");
        for (int j = 0; j <str2.length ; j++) {
            reW.push(str2[j]);
        }
        while (!reW.isEmpty()) {
            sb.append(reW.pop()).append(" ");
        }
        int temp = sb.length();
        sb.delete(temp - 1, temp);
        return sb.toString();
    }
}
