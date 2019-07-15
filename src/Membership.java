import java.util.ArrayList;
import java.util.Scanner;

public class Membership {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Join input = new Join();

        while (true) {
        input.join();
        System.out.println();

        System.out.println("새로운 회원가입을 하려면 yes를 입력해주세요.");
        String yes = scr.next();
        if (yes.equals("yes") && yes.equals("yes")) {
            continue;
        }
        else {
            break; }
        }
        }
    }





