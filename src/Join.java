import java.util.Scanner;

public class Join extends InforMation{
    public void join() {
        Scanner scr = new Scanner(System.in);

        System.out.println("사용할 아이디를 입력 하세요");
        id = scr.next();
        System.out.println("id=" + id);

        System.out.println("사용할 비밀번호를 입력 하세요");
        password = scr.next();
        System.out.println("password=" + password);

        System.out.println("비밀번호를 재입력 하세요");
        String PScheck = scr.next();
        while (!password.equals(PScheck)) {
            System.out.println("비밀번호가 동일하지 않습니다.");
            PScheck = scr.next();
        }
        System.out.println("PScheck=" + PScheck);

        System.out.println("이름을 입력 하세요");
        name = scr.next();
        System.out.println("name=" + name);

        System.out.println("핸드폰 번호를 입력 하세요");
        phone = scr.nextInt();
        System.out.printf("phone=%011d", phone);
    }
}


