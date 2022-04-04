package com.Sem3;

public class Driver_Result extends Result_2021_Store
{

    public int Calc_Driver_Points(int s)
    {
         int Total_Points=0;

        for(int i=0;i<20;i++)
        {
            if(Bahrain[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Bharain p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }

        for(int i=0;i<20;i++)
        {
            if(Emilia_Romagna[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Emilia Romagna p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Portugal[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Portugal p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Spain[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Spain p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Monaco[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Monaco p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Azerbaijan[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Azerbaijan p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(France[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("France p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Styria[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Styria p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Austria[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Austria p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Great_Britain[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Great Britain p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Hungry[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Hungry p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Belgium[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Belgium p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Netherlands[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Netherlands p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Italy[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Italy p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Russia[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Russia p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Turkey[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Turkey p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(United_States[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("United States p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Mexico[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Mexico p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Brazil[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Brazil p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Qatar[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Qatar p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Saudi_Arabia[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Saudi Arabia p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(Abu_Dhabi[i] == s)
            {
                Total_Points = Total_Points + points[i];
                System.out.println("Abu Dhabi p"+(i+1)+"-"+( points[i])+"points");break;
            }
        }
        return Total_Points;
    }

    public void Get_Driver_result(int s)
    {
        int TPoints= Calc_Driver_Points(s);
        System.out.println(" Total Points = "+TPoints);
    }

    public void Get_Driver_result(String s)  // name and triad in one function since both are string type
    {
        int driver_no=0;
        if(s.length() == 3)
        {
            for(int i=0;i<20;i++)
            {
                if(Driver_Triad[i]==s)
                {
                   driver_no = Driver_Number[i];
                }
            }
        }
        else
        {
            for(int i=0;i<20;i++)
            {
                if(Driver_Name[i]==s)
                {
                    driver_no = Driver_Number[i];
                }
            }
        }

        int TPoints = Calc_Driver_Points(driver_no);
        System.out.println(" Total Points = "+TPoints);

    }
}
