import java.util.Scanner;
//import java.lang.Math;

public class statistikasederhana {
    public static void main(String[] args) {
        
        Scanner ui = new Scanner(System.in);
        int hasil=0;
        //int n,i,b;
        int n = ui.nextInt();
        for(int i = 1; i <= n; i++){
            int b = ui.nextInt();
            hasil+= b;

        } 
        System.out.println(hasil);
        ui.close();
    }
}
