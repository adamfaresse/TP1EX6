public class Date {
    public static int maxLenght = 10;
    private int date ;
    static Date maintenant;
    public Date(int date){
        String dateString = String.valueOf(date);
        if(dateString.length()<=10){
            this.date = date;
        }else{
            System.out.println("Date non conforme");

        }

    }

    public Date plus(int duree){
        Date datePlus = new Date(this.date+duree);
        return datePlus;
    }

    public boolean avant(Date d){
        if(this.date < d.date){
            return true;
        }return false;
    }
    public static Date getMaintenant(){
        return maintenant;
    }
    public static void setMaintenant(Date d){
        maintenant = d;
    }
}
