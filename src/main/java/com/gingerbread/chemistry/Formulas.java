package com.gingerbread.chemistry;

public class Formulas {
    //TEORIA ONDULATORIA DE LA LUZ
    //Logitud de onda
    public static double longDeOnda (double f){
        double longOnda;
        double c = 300000000.00;
        longOnda = (c / f);
        return longOnda;
    }

    //Frecuencia en Hz
    public static double frecuencia (double l){
        double frecu;
        double c = 300000000.00;
        frecu = (c/l);
        return frecu;
    }

    //ENERGÍA CUANTIZADA Y FOTONES
    //Energía emitida de la radiación electromagnética
    public static double energia (double f){
        double energia;
        double h=0.0000000000000000000000000000000006626;
        energia = h*f;
        return energia;
    }

    //Frecuencia energia
    public static double frecuenciaEnergia (double e){
        double frecuenciaE;
        double h=0.0000000000000000000000000000000006626;
        frecuenciaE = e/h;
        return frecuenciaE;
    }

    //Modelo de Bohr
    //Energía por Bohr
    // public static double energiaBohr (double )
}
