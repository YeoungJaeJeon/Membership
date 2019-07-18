import java.util.ArrayList;
import java.util.Scanner;

public class Callin {
    public void caLLin(){
    Scanner scr = new Scanner(System.in);
    ArrayList<Join> inputList=new ArrayList<>();
    Join input = new Join();

        while (true) {
        input.join();
        System.out.println();
        inputList.add(input);

        System.out.println("새로운 회원가입을 하려면 yes를 입력해주세요.");
        String yes = scr.next();
        if (!yes.equals("yes")) {
            break; }
    }
        for(int index=0; index<inputList.size(); index++) {
        Join callin = inputList.get(index);
        System.out.println("회원 번호 : "+ index);
        System.out.println("회원 아이디 : "+callin.id);
        System.out.println("비밀번호 : "+callin.password);
        System.out.println("이름 : "+callin.name);
        System.out.println("핸드폰 번호 : "+callin.phone);
        }
    }
}