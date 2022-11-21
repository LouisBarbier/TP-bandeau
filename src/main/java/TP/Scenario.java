package TP;

import java.util.ArrayList;
import bandeau.Bandeau;
public class Scenario {
    private ArrayList<Effet> animations=new ArrayList<Effet>();
    private ArrayList<Integer> nbRepets=new ArrayList<Integer>();

    public Scenario(){};

    public void addAnim(Effet anim,Integer nbRepet){
        animations.add(anim);
        nbRepets.add(nbRepet);
    }

    public void presentation (Bandeau bandeau){
        for(int i=0;i<animations.size();i++){
            for(int j=0;j<nbRepets.get(i);j++) {
                animations.get(i).effectuer(bandeau);
                bandeau.sleep(500);
            }
        }
    }
}
