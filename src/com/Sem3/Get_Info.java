package com.Sem3;
import java.util.*;

public class Get_Info extends Driver_Info
{
    boolean check;
        public boolean search(String[] s, String t)            //  use function to check menu
        {
            check = Arrays.asList(s).contains(t);
            if(check == true)
            {
                Driver_Index = Arrays.asList(s).indexOf(t);
            }
           /* else
            {
                Driver_Index = s.length;
            }

            */
            return check;
        }
        public void get_name()                          // Input Driver name
        {
            System.out.println("Enter driver name:");
            String temp = sc.nextLine();

            if(search(Driver_Name, temp)==false)       // running check to see if record of the ntered driver already exists

            {
                Driver_Name[Driver_Index] = temp;
            }
            else
            {
                System.out.println("Driver record already exists");
            }


        }

        public void get_triad()                          // Input Driver triad ( name code)
        {
            if( check == false)
            {
                System.out.println("Enter driver Triad:");

                for(int i=0;;i++)                 // loop to ensure proper value is enytered
                {
                    String temp = sc.nextLine();
                    if (temp.contains(" ") == false & temp.length() == 3)    // to check for proper value of triad
                    {
                        Driver_Triad[Driver_Index] = temp;break;         // exits loops once correct value is entered
                    }
                    else
                    {
                        System.out.println("error: Triad should contain no spaces and should be of 3 characters ");
                        System.out.println("Enter Triad again:");
                    }
                }
            }
        }

        public void get_number()                           // Input Driver number
        {
            if( check == false)
            {
                System.out.println("Enter driver number:");
                Driver_Number[Driver_Index] = sc.nextInt();
            }
        }

}
