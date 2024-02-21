package etteremrendeles;

import java.util.ArrayList;

public class Rendeles {
    private String asztal;
    private ArrayList<Etel> rendelesek;

    public Rendeles(String asztal) {
        this.asztal = asztal;
        this.rendelesek = new ArrayList<Etel>();
    }
    
    public void ujRendeles(Etel etel){
        rendelesek.add(etel);
    }

    public String getAsztal() {
        return asztal;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }
}
