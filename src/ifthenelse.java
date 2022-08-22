import java.util.Scanner;

public class ifthenelse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int angka = userInput.nextInt();
        if(angka>0){
            System.out.println("positif");
        } else if (angka == 0){
            System.out.println("nol");

        } else{
            System.out.println("negatif");
        }
        userInput.close();
    }
}
