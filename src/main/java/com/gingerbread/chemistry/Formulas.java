package com.gingerbread.chemistry;

public class Formulas {
    //TEORÍA ONDULATORIA DE LA LUZ
    //Longitud de onda
    public static double longDeOnda (double f1){
        double longOnda;
        double c = 300000000.00;
        longOnda = (c / f1);
        return longOnda;
    }

    //Frecuencia en Hz
    public static double frecuencia (double l){
        double frecuencia;
        double c = 300000000.00;
        frecuencia = (c/l);
        return frecuencia;
    }

    //ENERGÍA CUANTIZADA Y FOTONES
    //Energía emitida de la radiación electromagnética
    public static double energy(double f2){
        double energy;
        double h=0.0000000000000000000000000000000006626;
        energy = h*f2;
        return energy;
    }

    //Frecuencia energía
    public static double frequencyEnergy(double e){
        double frecuenciaE;
        double h=0.0000000000000000000000000000000006626;
        frecuenciaE = e/h;
        return frecuenciaE;
    }

    //Modelo de Bohr
    //Energía por Bohr
    public static double energyByBohr(double ni, double nf){
        double resta, energyByBohr;
        double rh= 0.00000000000000000218;
        resta = (1/Math.pow(ni, 2)) - ( 1/Math.pow(nf, 2));
        energyByBohr = rh*resta;
        return energyByBohr;
    }
}
