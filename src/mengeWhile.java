import java.util.Scanner;
public class mengeWhile {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        //String user="a";
        while(ui.hasNext()){
          String user=ui.nextLine();
           System.out.println(user);
        }
        //System.out.println(user);
        ui.close();
    }
}
