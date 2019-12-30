import java.util.*;
/**
 * Write a description of class ESL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ESLStudents {
    private ArrayList<ESL> eslArr;

    public ESLStudents(){
        eslArr = new ArrayList<ESL>();
    }

    public void addStudent(ESL student){
        eslArr.add(student);
    }

    public void removeStudent(int index){
        eslArr.remove(index);
    }

    public Student getStudent(int index){
        return eslArr.get(index);
    }

    public int getTotalStudents(){
        return eslArr.size();
    }

    public int isFound(String id){
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public int getStudentLevel(Level level){
        int count = 0;
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getLevel()==level){
                count ++;
            }
        }
        return count;
    }

    public String toString(){
        return super.toString();
    }

    public static void test(){
        ESLStudents eslStudent = new ESLStudents();
        ESL esl = new ESL("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,Level.ESL1A);
        ESL esl1 = new ESL("876555757","Andrew ","Johnson",22,02,1979,Sex.MALE,Level.ESL5A);
        ESL esl2 = new ESL("343536566","Robert ","Hart",22,02,1989,Sex.MALE,Level.ESL1A);
        ESL esl3 = new ESL("547747474","Anthony ","Philips",22,02,1978,Sex.MALE,Level.ESL4B);
        ESL esl4 = new ESL("975555555","Simpson ","Thomas",22,02,1985,Sex.MALE,Level.ESL6A);
        eslStudent.addStudent(esl);
        eslStudent.addStudent(esl1);
        eslStudent.addStudent(esl2);
        eslStudent.addStudent(esl3);
        eslStudent.addStudent(esl4);
        //test
        eslStudent.removeStudent(3);

        if(!eslStudent.getStudent(3).toString().equals(esl4.toString())){
            throw new IllegalArgumentException(esl4.toString() + " was expected instead it found" + esl.getId());
        }

        if(eslStudent.getTotalStudents()!=4){
            throw new IllegalArgumentException(4 + " was expected instead it found" + esl.getId());
        }

        if(eslStudent.isFound("975555555")!=3){
            throw new IllegalArgumentException(3 + " was expected instead it found" + esl.getId());
        }   

        if(eslStudent.getStudentLevel(Level.ESL1A)!=2){
            throw new IllegalArgumentException( 2 + " was expected instead it found" + esl.getId());
        }
        
        System.out.println("Test was succesful");
    }    
}