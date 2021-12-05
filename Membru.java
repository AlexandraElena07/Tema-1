
public class Membru {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int salariu;
    protected int nrAniExperienta;

    public Membru(String nume, String prenume, int varsta, int salariu, int nrAniExperienta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.nrAniExperienta = nrAniExperienta;
    }

    public String getNume(){
        return nume;
    }

    public String getPrenume(){
        return prenume;
    }

    public int getnrAniExperienta(){
        return nrAniExperienta;
    }

    public int getVarsta(){
        return varsta;
    }

    public String getSalariu(){
        return salariu;
    }

    public String toString(){
        String aux = "Lider echipa: " + lider.nume + "-" + lider.prenume;
        for(int i = 0; i < nrMembri; i++){
            aux = aux + ", " + membri.get(i);
        }
    }

    @Override
    public boolean equals(Object o) {    
        if(o == null) {
            return false;
        }

       if (o instanceof Membru) {

       }
    }

}
