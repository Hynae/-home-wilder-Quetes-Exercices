public class Wilder{

    private String firstname;
    private boolean aware;


    public Wilder(String prenom, boolean conscient) {
        this.firstname = prenom;
        this.aware = conscient;
    }
    
    public String  getFirstname(){
            return this.firstname;
    }

    public void setFirstname(String firstname){
            this.firstname = firstname;
    }
    
   public boolean isAware() {
       return this.aware;
   }

    public String whoAmI(){
        if(aware){
            return "Je m'apelle " + this.firstname + " et je suis aware ";
        }
        else{
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware ";
        }

    }
}