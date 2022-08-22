import java.util.Scanner;

public class whilepencacah {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
int hasil=0;
        while (ui.hasNext()){
int asdf = ui.nextInt();
hasil = hasil+asdf;
        }
        System.out.println(hasil);
        ui.close();
    }
    
}
