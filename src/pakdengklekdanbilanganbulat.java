import java.util.Scanner;

public class pakdengklekdanbilanganbulat {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int x = ui.nextInt();
        int y = ui.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x % y);
        ui.close();
    }
}
