public class Main {
    public static void main(String[] args){
        Date.setMaintenant(new Date(1002131548));
        Date.setMaintenant(Date.getMaintenant().plus(Duree.MOIS));
        TicketSimple t = new Reduction50(new Ticket1jour());
        t.valide();
        System.out.println(t.getPrix()); // affiche 2.5 (au lieu de 5 sans reduc)
    }
}
