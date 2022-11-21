package TP;
import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Scenario scenar=new Scenario();
        scenar.addAnim(new Zoom(10F),4);
        scenar.addAnim(new Rotation((90.00*Math.PI)/180),4);
        scenar.addAnim(new Clignotant(500),10);

        Bandeau bandeau=new Bandeau();
        bandeau.setMessage("test");

        scenar.presentation(bandeau);
        bandeau.close();
    }

}
