
/**
 * This home work gives a summary of all the concepts we have learned through out the quarter starting from procedural to object oreinted 
 * programming. The program makes use of polymophism, inheritance and so on...
 *
 * @author (Kemba Konteh)
 * 
 * @version (CSC142 03/19/2018)
 */
public class College extends Student{
    public static final double CREDIT_PRICE = 110;
    
    public College(String id, String firstName, String lastName, int day, int month, int year, Sex sex, int credit){
        super(id, firstName, lastName, sex, day, month, year);
        setCredit(credit);
    }

    @Override
    public double getPrice() {
        return getCredit() * CREDIT_PRICE;
    }

    public boolean getFullTime(){
        if(getCredit() > 13)
            return true;
        return false;
    }
    
    public String toString(){
        String res="";
        res+="Name: " + getFirstName() + " " + getLastName() + "\n";
        res+="id " + getId() + "\n";
       
        res+="Balance =" + getPrice() + "\n";
        res+= "FullTime : " + getFullTime();
       return res; 
    }
    
    public static void test(){
        College col = new College("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,5);
        if(col.getFullTime()){
            throw new IllegalArgumentException("955311043 was expected instead it found" + col.getFullTime());
        }
        
            if(col.getPrice()!=550){
            throw new IllegalArgumentException("25.0 was expected instead it found" + col.getPrice());
        }
        
    }
}
