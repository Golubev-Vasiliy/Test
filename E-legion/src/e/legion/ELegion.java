
package e.legion;
import java.io.*;

public class ELegion {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        if(args.length==2)                        //Проверка на кол-во передаваемых аргументов
        {
            int Mas[][];
            int N=0, c, K=0;                      //Кол-во строк
            File f1 = new File(args[0]);
            FileReader Input = new FileReader(f1);
            while((c=Input.read())!=-1)           //Определение количества строк в файле
            {   
                System.out.print((char)c);
                if (c==10) N++;
                if (c>=48 && c<=57) K++;
            }
            Input.close();
            System.out.print("Строк считано - " + N + "\n");
            System.out.print("Символов считано - " + K + "\n");
            System.out.printf("%s\n", args[0]);
            System.out.printf("%s\n", args[1]);
            Mas = new int[N][4];                  //Mas[N][x1, y1, x2, y2] 
            FileReader Input1 = new FileReader(f1);
            for(int j=0; j<N; j++)                //Запись чисел из файла в массив
            {
                for(int i=0; i<=3; i++)
                    while((c=Input1.read())!=-1)
                        if (c>=48 && c<=57)
                        {
                            Mas[j][i]=c-48;
                            break;
                        }
            }
            for(int j=0; j<N; j++)                //вывод массива на экран
            {
                for(int i=0; i<=3; i++)
                    System.out.printf("Mas[%d][%d]=%d ", j, i, Mas[j][i]);
                System.out.println();
            }
            
            for(int j=0; j<N; j++)                //Сортировка - смысл в том, что        
            {                                     //первые 2 числа массива - всегда левый угол      
                int xx, yy;  
                if (Mas[j][0]>Mas[j][2])
                {
                    xx=Mas[j][2];
                    Mas[j][2]=Mas[j][0];
                    Mas[j][0]=xx;
                    yy=Mas[j][3];
                    Mas[j][3]=Mas[j][1];
                    Mas[j][1]=yy;
                }    
                System.out.println();
            }
            
            int vx=100, x1,x2,y1,y2;                          //Переменна показывающая сколько раз за цикл менялись местами строки
            while(vx!=0)
            {
                vx=0;
                for(int j=0; j<N; j++)
                {                                 
                    if(j!=N-1)
                    if (Mas[j][0]>Mas[j+1][0])                   //Сортировка на удаленность от оси Y
                    {
                        x1=Mas[j][0]; y1=Mas[j][1]; x2=Mas[j][2]; y2=Mas[j][3];
                        Mas[j][0]=Mas[j+1][0]; Mas[j][2]=Mas[j+1][1];
                        Mas[j][2]=Mas[j+1][2]; Mas[j][3]=Mas[j+1][3];
                        Mas[j+1][0]=x1; Mas[j+1][1]=y1; Mas[j+1][2]=x2;
                        Mas[j+1][3]=y2;
                        vx++;
                    }
                }
            }
            
            for(int j=0; j<N; j++)                //вывод массива на экран
            {
                for(int i=0; i<=3; i++)
                    System.out.printf("Mas[%d][%d]=%d ", j, i, Mas[j][i]);
                System.out.println();
            }
        }
        else
            System.out.print("Ошибка!\nКоличество передаваемых аргументов должно быть 2 ");

        
    }
    
}