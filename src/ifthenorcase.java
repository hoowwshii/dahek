import java.util.Scanner;

public class ifthenorcase{
public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    int asd = ui.nextInt();
    if(asd < 10){
        System.out.println("satuan");
    } else if (asd <= 99){
        System.out.println("puluhan");
    } else if (asd <= 999){System.out.println("ratusan");} 

     else if (asd <= 9999){System.out.println("ribuan");} 

     else if (asd > 9999){System.out.println("puluhribuan");} 

ui.close();

}}

