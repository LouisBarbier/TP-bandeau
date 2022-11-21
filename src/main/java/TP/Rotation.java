package TP;
import bandeau.Bandeau;
public class Rotation extends Effet{

    private double rot;

    public Rotation (double rot){
        this.rot=rot;
    }

    public void effectuer (Bandeau bandeau){
        bandeau.setRotation(bandeau.getRotation()+rot);
    }
}
