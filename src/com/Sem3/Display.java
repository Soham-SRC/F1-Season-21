package com.Sem3;
import java.util.*;
class Display extends Get_Info
{
    public void display()
    {

        int a,b;
        String tm="";
        for(a=0;a<10;a++)          // searching driver's team
        {
            for(b=1;b<3;b++)
            {
                if( Driver_Name[Driver_Index].equals(Team[a][b]))
                {
                    tm = Team[a][0];
                }break;
            }
        }

        System.out.println("Driver  "+Driver_Name[Driver_Index]);
        System.out.println("Team  "+tm);
        System.out.println("Symbol  "+Driver_Triad[Driver_Index]);
        System.out.println("Car Number  "+Driver_Number[Driver_Index]);
    }
}
