import java.util.Scanner;

public class jarakManhattan{

    public static void main(String[] args){
Scanner ui= new Scanner(System.in);
int x1=ui.nextInt(); int y1=ui.nextInt(); int x2=ui.nextInt(); int y2=ui.nextInt();
int x=x1-x2;
int y=y1-y2;

if(x<0){
x=x*-1;
}  
if(y<0){
    y=y*-1;
}
//System.out.println(x);System.out.println(y);
int hasil = x+(y);
System.out.println(hasil);
ui.close();

    }
}