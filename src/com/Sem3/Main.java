package com.Sem3;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\t\t\t\t\t                        _ _\n" +
                "\t\t\t\t\t                   _.--\"\"  ||\n" +
                "\t\t\t\t\t   .----.     _.-'   |/\\| |.--.\n" +
                "\t\t\t\t\t   | 44 |__.-'   _________|  |_)  _______________  \n" +
                "\t\t\t\t\t    |  .-\"\"-.\"\"\"\"\" ___,    `----'\"))   __   .-\"\"-.\"\"\"\"--._  \n" +
                "\t\t\t\t\t   '-' ,--. `    |   |   .---.       |:.| ' ,--. `      _`.\n" +
                "\t\t\t\t\t     ( (    ) ) __|   |__ \\\\\\\\ _..--  \\/ ( (    ) )--._\".-.\n" +
                "\t\t\t\t\t      . `--' ;\\__________________..--------. `--' ;--------'\n" +
                "\t\t\t\t\t       `-..-'                               `-..-'\n");
        System.out.println("Formula 1 \n 2021");

        Scanner sc = new Scanner(System.in);
        Result_2021 r1 = new Result_2021();      //objects
        Display d0 = new Display();
        Driver_Result dr1 = new Driver_Result();

        int a=0;
        while(a!=5)
        {

            System.out.println(" \n\nMENU \n 1.Enter Grand Prix Result \n 2.Display Grand Prix Result \n 3.New Driver Record \n 4.Driver Finishes In 2021 Season \n 5.Exit");
            a = sc.nextInt();
            switch (a)
            {

                case 1:
                    r1.Input_Result_21();
                    break;
                case 2:
                    r1.Output_Result_21();
                    break;
                case 3:
                    d0.get_name();
                    d0.get_triad();
                    d0.get_number();
                    d0.display();
                    break;
                case 4:

                    System.out.println("enter driver /car no");
                    //String str = sc.nextLine();
                    int n = sc.nextInt();
                    dr1.Get_Driver_result(n);
                    break;
            }
        }

/* add another menu option to see result of a specifc driver in all races and to calculate
his total points.
use function overloading to take in drivers detail (car number),(name), (triad)
 */

    }
}
