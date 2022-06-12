package com.gingerbread.chemistry;

public class Formulas {
    //TEORIA ONDULATORIA DE LA LUZ
    //Logitud de onda
    public static double longDeOnda (double f1){
        double longOnda;
        double c = 300000000.00;
        longOnda = (c / f1);
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
    public static double energia (double f2){
        double energia;
        double h=0.0000000000000000000000000000000006626;
        energia = h*f2;
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
    public static double energiaBohr (double ni, double nf){
        double resta, energiaB;
        double rh= 0.00000000000000000218;
        resta = (1/Math.pow(ni, 2)) - ( 1/Math.pow(nf, 2));
        energiaB = rh*resta;
        return energiaB;
    }
}
