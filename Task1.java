import java.util.Scanner;

/*
Задание 1
 */
public class Task1 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int x1 = (x-x % 1000)/1000;
        int x2 = (x%1000-x%100) / 100;
        int x3 = (x%100-x%10) / 10;
        int x4 = x-x1*1000-x2*100-x3*10;
        System.out.println(x1+"---"+x2+"--"+x3+"--"+x4);
        if ((x1+x2)==(x3+x4)) {
            System.out.println("true");
        }
        else {
            System.out.println(false);
        }


    }
}
