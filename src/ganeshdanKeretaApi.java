import java.util.Scanner;

import javax.lang.model.type.ArrayType;
public class ganeshdanKeretaApi {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int jumlah = ui.nextInt();
        int jumlaharray= jumlah+1;
        int[] array = new int[jumlah];
        for(int i = 0; i<=jumlah; i++){
            array[i] = ui.nextInt();
        }
      
        for (int ind = jumlah-1; ind>=0; ind--){
           if(ind!=0){System.out.printf("%d, ", array[ind]);}
            
        }
        ui.close();
            }
            
    }
    

