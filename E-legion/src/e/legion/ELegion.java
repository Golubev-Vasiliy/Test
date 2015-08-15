
package e.legion;
import java.io.*;

public class ELegion {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length==2)      //Проверка на кол-во передаваемых аргументов
        {
            int Mas[][];
            int N;                      //Кол-во строк
            File Input = new File(args[0]);
            System.out.printf("%s\n", args[0]);
            System.out.printf("%s\n", args[1]);
            Mas = new int[N=99][3];       //Mas[N][x1, y1, x2, y2]           
        }
        else
            System.out.print("Ошибка!\nКоличество передаваемых аргументов должно быть 2 ");

        
    }
    
}
