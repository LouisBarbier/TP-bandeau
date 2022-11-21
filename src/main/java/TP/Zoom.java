package TP;

import java.awt.*;
import bandeau.Bandeau;
public class Zoom extends Effet{

    private float zoom;

    public Zoom (float zoom){
        this.zoom=zoom;
    }

    public void effectuer (Bandeau bandeau){
        bandeau.setFont(bandeau.getFont().deriveFont(bandeau.getFont().getSize()+zoom));
    }
}