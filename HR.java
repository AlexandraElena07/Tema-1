class HR extends Echipa {
    int costuri = 0;
    int s = 0;

    public HR (String nume, int nrMembri) {
        super(nume, nrMembri);
    }

    @Override
    public int getCost(){
        int aux = 1300 + this.getLider().getnrAniExperienta();
        for(int i = 0; i < nrMembri; i++) {
            if((membri.get(i)).nrAniExperienta < 2) {
                s = 1000;
            } else if(2 < (membri.get(i)).nrAniExperienta && (membri.get(i)).nrAniExperienta < 5) {
                s = 1250;
            } else {
              s = 1500;
            }
        }
        aux = aux + s;
    }
}
