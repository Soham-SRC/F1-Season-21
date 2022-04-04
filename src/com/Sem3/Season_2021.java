package com.Sem3;

abstract class Season_2021 extends Season
{


    String[] GP_Bahrain = new String[20]; //{"HAM","VER","BOT","NOR","PER","LEC","RIC","SAI","TSU","STR","RAI","GIO","OCO","RUS","VET","MSC","GAS","LAT","ALO","MAZ"};
    String[] GP_Emilia_Romagna = new String[20];
    String[] GP_Portugal = new String[20];
    String[] GP_Spain = new String[20];
    String[] GP_Monaco = new String[20];
    String[] GP_Azerbaijan = new String[20];
    String[] GP_France = new String[20];
    String[] GP_Styria = new String[20];
    String[] GP_Austria = new String[20];
    String[] GP_Great_Britain = new String[20];
    String[] GP_Hungry = new String[20];
    String[] GP_Belgium = new String[20];
    String[] GP_Netherlands = new String[20];
    String[] GP_Italy = new String[20];
    String[] GP_Russia = new String[20];
    String[] GP_Turkey = new String[20];
    String[] GP_United_States = new String[20];
    String[] GP_Mexico = new String[20];
    String[] GP_Brazil = new String[20];
    String[] GP_Qatar = new String[20];
    String[] GP_Saudi_Arabia = new String[20];
    String[] GP_Abu_Dhabi = new String[20];

}

class Result_2021 extends Result_2021_Store
{
    // continuation on input result
    public void Input_Result_21()
    {
        System.out.println("Select Grand Prix");
        System.out.println("1 Bahrain \n" +
                "2 Emilia_Romagna \n" +
                "3 Portugal \n" +
                "4 Spain \n" +
                "5 Monaco \n" +
                "6 Azerbaijan \n" +
                "7 France \n" +
                "8 Styria \n" +
                "9 Austria\n" +
                "10 Great_Britain \n" +
                "11 Hungry \n" +
                "12 Belgium \n" +
                "13 Netherlands \n" +
                "14 Italy \n" +
                "15 Russia \n" +
                "16 Turkey \n" +
                "17 United_States \n" +
                "18 Mexico \n" +
                "19 Brazil \n" +
                "20 Qatar \n" +
                "21 Saudi_Arabia \n" +
                "20 Abu_Dhabi \n");

        int a = sc.nextInt();

        switch (a)    //to switch between the desired GP result
        {
            case 1:
                Get_Result(Bahrain,GP_Bahrain);break;
            case 2:
                Get_Result(Emilia_Romagna, GP_Emilia_Romagna);break;
            case 3:
                Get_Result(Portugal,GP_Portugal);break;
            case 4:
                Get_Result(Spain,GP_Spain);break;
            case 5:
                Get_Result(Monaco,GP_Monaco);break;
            case 6:
                Get_Result(Azerbaijan,GP_Azerbaijan);break;
            case 7:
                Get_Result(France,GP_France);break;
            case 8:
                Get_Result(Styria,GP_Styria);break;
            case 9:
                Get_Result(Austria,GP_Austria);break;
            case 10:
                Get_Result(Great_Britain,GP_Great_Britain);break;
            case 11:
                Get_Result(Hungry,GP_Hungry);break;
            case 12:
                Get_Result(Belgium,GP_Belgium);break;
            case 13:
                Get_Result(Netherlands,GP_Netherlands);break;
            case 14:
                Get_Result(Italy,GP_Italy);break;
            case 15:
                Get_Result(Russia,GP_Russia);break;
            case 16:
                Get_Result(Turkey,GP_Turkey);break;
            case 17:
                Get_Result(United_States,GP_United_States);break;
            case 18:
                Get_Result(Mexico,GP_Mexico);break;
            case 19:
                Get_Result(Brazil,GP_Brazil);break;
            case 20:
                Get_Result(Qatar,GP_Qatar);break;
            case 21:
                Get_Result(Saudi_Arabia,GP_Saudi_Arabia);break;
            case 22:
                Get_Result(Abu_Dhabi,GP_Abu_Dhabi);break;
        }

    }

    //continuation of display result
    public void Output_Result_21()
    {
        System.out.println("Select Grand Prix");
        System.out.println("1 Bahrain \n" +
                "2 Emilia_Romagna \n" +
                "3 Portugal \n" +
                "4 Spain \n" +
                "5 Monaco \n" +
                "6 Azerbaijan \n" +
                "7 France \n" +
                "8 Styria \n" +
                "9 Austria\n" +
                "10 Great_Britain \n" +
                "11 Hungry \n" +
                "12 Belgium \n" +
                "13 Netherlands \n" +
                "14 Italy \n" +
                "15 Russia \n" +
                "16 Turkey \n" +
                "17 United_States \n" +
                "18 Mexico \n" +
                "19 Brazil \n" +
                "20 Qatar \n" +
                "21 Saudi_Arabia \n" +
                "20 Abu_Dhabi \n");

        int a = sc.nextInt();

        switch (a)    //to switch between the desired GP result
        {
            case 1:
                Put_Result(Bahrain,GP_Bahrain);break;
            case 2:
                Put_Result(Emilia_Romagna, GP_Emilia_Romagna);break;
            case 3:
                Put_Result(Portugal,GP_Portugal);break;
            case 4:
                Put_Result(Spain,GP_Spain);break;
            case 5:
                Put_Result(Monaco,GP_Monaco);break;
            case 6:
                Put_Result(Azerbaijan,GP_Azerbaijan);break;
            case 7:
                Put_Result(France,GP_France);break;
            case 8:
                Put_Result(Styria,GP_Styria);break;
            case 9:
                Put_Result(Austria,GP_Austria);break;
            case 10:
                Put_Result(Great_Britain,GP_Great_Britain);break;
            case 11:
                Put_Result(Hungry,GP_Hungry);break;
            case 12:
                Put_Result(Belgium,GP_Belgium);break;
            case 13:
                Put_Result(Netherlands,GP_Netherlands);break;
            case 14:
                Put_Result(Italy,GP_Italy);break;
            case 15:
                Put_Result(Russia,GP_Russia);break;
            case 16:
                Put_Result(Turkey,GP_Turkey);break;
            case 17:
                Put_Result(United_States,GP_United_States);break;
            case 18:
                Put_Result(Mexico,GP_Mexico);break;
            case 19:
                Put_Result(Brazil,GP_Brazil);break;
            case 20:
                Put_Result(Qatar,GP_Qatar);break;
            case 21:
                Put_Result(Saudi_Arabia,GP_Saudi_Arabia);break;
            case 22:
                Put_Result(Abu_Dhabi,GP_Abu_Dhabi);break;
        }

    }

}


