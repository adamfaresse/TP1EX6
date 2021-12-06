public class TicketRechargeable {
    private int nbVoyages;
    private TicketSolo ticket;
    public TicketRechargeable(int nbVoyages){
        this.nbVoyages = nbVoyages;
    }

    public int reste(){
        return nbVoyages;
    }

    public void recharge(int n){
        nbVoyages =nbVoyages + n;
    }

    public boolean valide(){
        if(reste()>0){
            if(ticket.valide()){
                return true;
            }ticket.setIsUsed(false);
            nbVoyages = reste()-1;
            return ticket.valide();
        }return ticket.valide();
    }

}
