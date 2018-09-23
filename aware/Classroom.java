public class Classroom{

    public static void main (String [] args){
       
        Wilder Malzar = new Wilder("Malzar",false);
        System.out.println(Malzar.whoAmI());
        Malzar.setFirstname("Machin");
        System.out.println(Malzar.whoAmI());
        Wilder Maximus = new Wilder ("Maximus", true);
        System.out.println(Maximus.whoAmI());

    }




}