public class TicketPerso extends TicketRechargeable{
    private TicketSimple ticketAbonnement;
    public TicketPerso() {
        super(0);
    }

    public boolean abonnement(int duree,float prix){
        if(!ticketAbonnement.valide() || ticketAbonnement == null){
            ticketAbonnement = new TicketSimple(duree,prix);
            return true;
        }return false;

    }
    public boolean valide(){
        if(ticketAbonnement!= null && ticketAbonnement.valide()){
            return true;
        }return super.valide();
    }
}
