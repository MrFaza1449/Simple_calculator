import Calculations.Division;
import Calculations.Multiplication;
import Calculations.Subtraction;
import Calculations.Summa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
         System.out.println("Добро пожаловать!" +
                 " \n1)Сложение \n2)Вычитание \n3)Умножение \n4)Деление");
         System.out.print("Выберите способ решение: ");
         Scanner in = new Scanner(System.in);
         int count = in.nextInt();

         switch(count)
         {
             case 1:
                 Summa.welcome();
                 break;
             case 2:
                 Subtraction.welcome();
                 break;
             case 3:
                 Multiplication.welcome();
                 break;
             case 4:
                 Division.welcome();
                 break;
             default:
                 System.out.print("Выбранный пункт не существует!");
         }
    }
}
