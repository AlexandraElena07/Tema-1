
class Main {
    public static void main(String[] args){
        Echipa e1 = new DevTeam("DevTeam", 20);
        e1.setLeader(new Membru("Popescu", "Mihai", 22, 3200, 6));
        e1.setLeader(new Membru("Petrica", "Cristian", 27, 6500, 8));

        e1.addMember(new Membru("Ionescu", "Maria", 27, 2500, 4));
        e1.addMember(new Membru("Dumitrescu", "Diana", 30, 7500, 3));
        e1.addMember(new Membru("Marinescu", "Madalina", 29, 5500, 1));
        
        System.out.println(dev.getCost());
        System.out.println(e1);
    }
}
