public class TicketSimple {
    public int dureeValidite;
    public float prix;
    private boolean isUsed ;
    private Date dateLimite;

    public TicketSimple(int dureeValidite, float prix){
        this.dureeValidite = dureeValidite;
        this.prix = prix;
        this.isUsed = false;
    }
    public void setIsUsed(boolean b){
        this.isUsed = b;
    }
    public float getPrix(){
        return this.prix;
    }

    public boolean valide(){
        if(!isUsed) {
            dateLimite = Date.getMaintenant().plus(dureeValidite);
            isUsed = true;
            return true;
        }return Date.getMaintenant().avant(dateLimite);
    }

}
