
package e.legion;
import java.io.*;

public class ELegion {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        if(args.length==2)      //Проверка на кол-во передаваемых аргументов
        {
            int Mas[][];
            int N, c;                      //Кол-во строк
            File f1 = new File(args[0]);
            FileReader Input = new FileReader(f1);
            System.out.printf("%s\n", args[0]);
            System.out.printf("%s\n", args[1]);
            Mas = new int[N=99][3];       //Mas[N][x1, y1, x2, y2]           
        }
        else
            System.out.print("Ошибка!\nКоличество передаваемых аргументов должно быть 2 ");

        
    }
    
}