import java.util.ArrayList;
/**
 * Write a description of class CollegeStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CollegeStudents {
    private ArrayList<College> collegeArr;

    public CollegeStudents(){
        collegeArr = new ArrayList<College>();
    }

    public void addStudent(College student){
        collegeArr.add(student);
    }

    public void removeStudent(int index){
        collegeArr.remove(index);
    }

    public Student getStudent(int index){
        return collegeArr.get(index);
    }

    public int getTotalStudents(){
        return collegeArr.size();
    }

    public int isFound(String id){
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public int getFullTime(){
        int count = 0;
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getFullTime()){
                count ++;
            }
        }
        return count;
    }

    public String toString(){
        return super.toString();
    }
    
    public static void test(){
        CollegeStudents college = new CollegeStudents();
        College col = new College("955311043","Kemba ","Konteh",22,02,1998,Sex.MALE,5);
        College col1 = new College("876555757","Andrew ","Johnson",22,02,1979,Sex.MALE,4);
        College col2 = new College("343536566","Robert ","Hart",22,02,1989,Sex.MALE,10);
        College col3 = new College("547747474","Anthony ","Philips",22,02,1978,Sex.MALE,15);
        College col4 = new College("975555555","Simpson ","Thomas",22,02,1985,Sex.MALE,20);
        college.addStudent(col);
        college.addStudent(col1);
        college.addStudent(col2);
        college.addStudent(col3);
        college.addStudent(col4);
        //test
        college.removeStudent(3);

        if(!college.getStudent(3).toString().equals(col4.toString())){
            throw new IllegalArgumentException(col4.toString() + " was expected instead it found" + col.getId());
        }

        if(college.getTotalStudents()!=4){
            throw new IllegalArgumentException(4 + " was expected instead it found" + col.getId());
        }

        if(college.isFound("975555555")!=3){
            throw new IllegalArgumentException(3 + " was expected instead it found" + col.getId());
        }   
    }    

}
