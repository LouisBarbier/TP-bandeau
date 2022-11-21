package TP;

import java.awt.*;
import bandeau.Bandeau;

public class Clignotant extends Effet{

    private int milliDispar;

    public Clignotant(int milliDispar){
        this.milliDispar=milliDispar;
    }

    public void effectuer (Bandeau bandeau){
        Color C = bandeau.getForeground();
        bandeau.setForeground(bandeau.getBackground());
        bandeau.sleep(milliDispar);
        bandeau.setForeground(C);
    }
}