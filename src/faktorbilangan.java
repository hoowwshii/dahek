import java.util.Scanner;

public class faktorbilangan {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int faktor=ui.nextInt();
        for(int i=1; i <= faktor; i++){
            if(faktor%i==0)
            {
                System.out.println(faktor/i);
            }ui.close();
        }
    }
}
