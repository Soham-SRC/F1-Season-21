package com.Sem3;


class Driver_Info extends Formula1
{
//storing current driver names
    String[] Driver_Name = new String[] {"Lewis Hamilton","Max Verstappen","Valtteri Bottas","Sergio Perez","Lando Norris",
            "Charles Leclerc", "Carlos Sainz","Daniel Ricciardo","Pierre Gasly","Fernando Alonso","Esteban Ocon","Sebastian Vettel",
            "Lance Stroll","Yuki Tsunoda","George Russell","Kimi Raikkonen","Nicholas Latifi","Antonio Giovinazzi","Mick Schumacher",
            "Robert Kubica","Nikita Mazepin"};

//initialiazing driver triads/ short forms
    String[] Driver_Triad = new String[]{"HAM","VER","BOT","PER","NOR","LEC","SAI","RIC","GAS","ALO","OCO","VET","STR","TSU","RUS","RAI","LAT","GIO","MSC","KUB","MAZ"};

//car number of each driver
    int[] Driver_Number = new int[]{44,33,77,11,4,16,55,3,10,14,31,5,18,22,63,7,6,99,47,0,9};

// storing team name and its driver in form of a 2 dimensional array
    String[][] Team = new String[][]{
            {"Read Bull","Max Verstappen","Sergio Perez"},        //{team name, driver 1, driver 2}
            {"Mercedes","Lewis Hamilton","Valtteri Bottas"},
            {"McLaren","Lando Norris","Daniel Ricciardo"},
            {"Ferrari","Charles Leclerc","Carlos Sainz"},
            {"Alpine","Fernando Alonso","Esteban Ocon"},
            {"Alpha Turi","Pierre Gasley"},
            {"Aston Martin","Sebastian Vettele","Lance Stroll"},
            {"Alfa Romeo","Kimmi Raikkonen","Antonio Giovinazzi"},
            {"Williams","George Russell","Nicholas Latifi"},
            {"Haas","Mic Schumacher","Nikita Mazepin"}};

    int Driver_Index;
    // Driver_Index is the index corresponding to where his data is stored in evry info array

    {
        Driver_Index = -1;
        /*
        Driver_Name[5]= "Lewis Hamilton";
        Driver_Triad[5]= "HAM";
        Driver_Number[5]=44;
        Driver_Name[6]= "Max Verstapen";
        Driver_Triad[6]= "VER";
        Driver_Number[6]=33;
        */
    }
}