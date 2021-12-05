class DevTeam extends Echipa {
    int costuri = 0;
    int s = 0;

    public DevTeam (String nume, int nrMembri) {
        super(nume, nrMembri);
    }

    @Override
    public int getCost(){
        int aux = 2500 + this.getLider().getnrAniExperienta() * 250;
        for(int i = 0; i < nrMembri; i++) {
            if((membri.get(i)).nrAniExperienta < 2) {
                s = 1500;
            } else if(2 < (membri.get(i)).nrAniExperienta && (membri.get(i)).nrAniExperienta < 5) {
                s = 1875;
            } else {
              s = 2250;
            }
        }
        aux = aux + s;
    }
}
