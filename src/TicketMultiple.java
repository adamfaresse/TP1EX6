/*public class TicketMultiple extends TicketRechargeable{

    public TicketMultiple(int nbVoyages) {
        super(nbVoyages);
    }

    @Override
    public void recharge(int n) {

    }
}*/
public class TicketMultiple {
    private TicketRechargeable ticket ;
    public TicketMultiple(int nbVoyage){
        this.ticket = new TicketRechargeable(nbVoyage);
    }
    public int reste(){
        return ticket.reste();
    }


    public boolean valide(){
        return ticket.valide();
    }
}
