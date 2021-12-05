import java.util.ArrayList;

abstract class Echipa{
    private String nume;
    protected int nrMembri;
    protected Membru lider;
    ArrayList<Membru> membri = new ArrayList<>();
    protected int count = 0;

    public Echipa (String nume, int nrMembri) {
        this.nume = nume;
        this.nrMembri = nrMembri;
    }

    
    public boolean addMember(Membru m) {
        if(this.membri.size() < this.nrMembri){
            this.membri.add(m);
            return true;
        }
        else {
         return false;
        }

    }

    public Member removeMember(Membru member) {
        for(int i = 0; i < nrMembri; i++){
            if((membri.get(i)).equals(member)) {
                this.membri.remove(i);
                return member;
            } else {
                return null;
                }
            }
        }
    
    public boolean setLeader(Membru liderNou) {
        if(liderNou.getnrAniExperienta() >= 5){
            this.lider=liderNou;
            return true;
        } else {
            return false;
        }
    }

    public abstract double getCost();

    public Membru getLider() {
        return this.lider;
    }

    public void setDate(int nrMembri, String nume) {

    }

}