import java.util.Scanner;

public class pakdengklekmauUjian {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int a = ui.nextInt();
        if(a>=0 && a<=100){
System.out.println("YA");
        } else {System.out.println("TIDAK");}
        ui.close();
    }
}
