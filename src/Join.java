import java.util.Scanner;

public class Join extends InforMation{
    public static void join() {
        Scanner scr = new Scanner(System.in);
        InforMation info = new InforMation();

        System.out.println("사용할 아이디를 입력 하세요");
        info.id = scr.next();
        System.out.println("id=" + info.id);

        System.out.println("사용할 비밀번호를 입력 하세요");
        info.password = scr.next();
        System.out.println("password=" + info.password);

        System.out.println("비밀번호를 재입력 하세요");
        String PScheck = scr.next();
        while (!info.password.equals(PScheck)) {
            System.out.println("비밀번호가 동일하지 않습니다.");
            PScheck = scr.next();
        }
        System.out.println("PScheck=" + PScheck);

        System.out.println("이름을 입력 하세요");
        info.name = scr.next();
        System.out.println("name=" + info.name);

        System.out.println("핸드폰 번호를 입력 하세요");
        info.phone = scr.nextInt();
        System.out.printf("phone=%011d", info.phone);
    }
}


