
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        MyLine val= new MyLine();
        String num= val.getNum();
        while (val.getMyLine()==null) {
            try {
                val.setNum("");
                val.setMyLine(scr.nextLine());
            } catch (AnyException ae) {
                System.out.println(ae.getMessage() + ": " + val.getNum());
                }
        }
        System.out.println(val.getMyLine());
    }
}
