

import java.io.FileNotFoundException;
public class ESL extends Student{
    public static final int CREDIT = 5;
    public static final double PRICE = 25.0;
    private Level level;

    public ESL(String id, String firstName, String lastName, int day, int month, int year, Sex sex,Level level){
        super(id, firstName, lastName, sex, day, month, year);
        this.level = level;
        setCredit(CREDIT);
    }
    
    @Override
    public double getPrice() {
        return PRICE;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString(){
        String res="";
        res+="Name: " + getFirstName() + " " + getLastName() + "\n";
        res+="id " + getId() + "\n";
        res+="Level " + getLevel() + "\n";
        res+="Balance " + getPrice();
        return "";
    }

    public static void test(){
        ESL esl = new ESL("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,Level.ESL1A);
        if(!esl.getId().equals("955311043")){
            throw new IllegalArgumentException("955311043 was expected instead it found" + esl.getId());
        }
        
            if(esl.getPrice()!=PRICE){
            throw new IllegalArgumentException("25.0 was expected instead it found" + esl.getPrice());
        }
        
        if(esl.getLevel()!=Level.ESL1A){
            throw new IllegalArgumentException("ESL1A was expected instead it found " + esl.getLevel());
        }
        
               
    }
}
