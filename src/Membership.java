public class Membership{
   public static void main(String[] args) {
       int a;
       int b;
       a=2;

       System.out.println(!(a == 0 || a == 1));
       System.out.println(a > 0 && a > 1);
       System.out.println(!(a == 0) && !(a == 1));


       a=25;
       b=24;

       boolean x, y;
       x = a > b;
       y= a == b++;

       System.out.println("x= true  "+x);
       System.out.println("y= fales  "+y);

        int high = 100;
        int low = 20;

       System.out.println("high>low= true   " +(high>low));
       System.out.println("(high>=100) && (high >=200)=fales   " +((high>=100) && (high >=200)));
       System.out.println("(low>=50) || (low <= 20)=true   " +((low>=50) || (low <= 20)));
       System.out.println("(-high % 3 <= 0)=true   "+((-high % 3 <= 0)));
       System.out.println("(high % -7 <= 0)=fales   "+((high % -7 <= 0)));

       System.out.println("혼자놀기");
       String jeon="영재";
       String yeoungjae="영재는 영재이다.";
       String genius="천재";
       String stupid="바보";
       String peple="평범한 사람";

       if(jeon.equals("천재")){
           System.out.println(genius);
       }
       else if(!jeon.equals(genius)){
           System.out.println("영재는 "+stupid+" 이다.");
       }
       else
           System.out.println("영재는 "+peple+" 이다." );

       if(jeon.equals("천재") ? jeon.equals(genius) : (jeon.equals(peple) ? jeon.equals(stupid) : jeon.equals("영재") ))
       { System.out.println(yeoungjae);

       int num=10;
       System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
       }
}
}