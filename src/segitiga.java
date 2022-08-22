import java.util.Scanner;

class segitiga{

    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        double angkasatu = userinput.nextInt();
        double angkadua = userinput.nextInt();
        double hasil = angkasatu *angkadua/2;
        System.out.printf("%.2f", hasil);
        userinput.close();
    }
}