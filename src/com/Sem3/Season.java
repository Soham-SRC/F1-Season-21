package com.Sem3;
import java.util.*;

public class Season extends Driver_Info
{
    int[] points = new int[]{25,18,15, 12, 10, 8, 6, 4, 2,1,0,0,0,0,0,0,0,0,0,0};
    //initializing points scored respect to every position ie from p1-p20

    //function to enter a GP result
    public void Get_Result(int[] GP, String[] gp)
    {
        System.out.println(" Enter Car Number p1-p20 ");
        for(int i=0; i<20;i++)
        {
            GP[i] = sc.nextInt();
            int og_index=0;

            for(int c=0;c<20;c++)
            {
                if(Driver_Number[c]==GP[i])
                {
                   og_index = c;
                }
            }
            gp[i] = Driver_Triad[og_index];
        }

    }

    //function to display a GP result
    public void Put_Result(int[] GP, String[] gp)
    {
        //System.out.println(gp+"results");
        for(int i=0; i<20;i++)
        {
            /*int temp = GP[i];
            System.out.println("its working "+GP[i]);
            gp[i] = Driver_Triad[Arrays.asList(Driver_Number).indexOf(temp)];

             //indexOf() is a bloody STRING function

             */

            int og_index=0;
            for(int c=0;c<20;c++)
            {
                if(Driver_Number[c]==GP[i])
                {
                    og_index = c;
                }
            }
            gp[i] = Driver_Triad[og_index];
            System.out.println("P"+(i+1)+" "+gp[i]+" "+points[i]+" points");
        }
    }

}
