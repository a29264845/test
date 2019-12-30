
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Student implements Person{

    private String id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private int day;
    private int month;
    private int year;
    private int credit;

    public Student(String id, String firstName, String lastName, Sex sex, int day, int month, int year) {
        if(!checkBirth(day, month, year)||checkIfEmpty(firstName, lastName, id)){
            throw new IllegalArgumentException("Invalid input");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public int getBirthDay() {
        return day;
    }

    public int getBirthMonth() {
        return month;
    }

    public int getBirthYear() {
        return year;
    }

    public int getCredit() {
        return credit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setBirthDay(int day) {
        this.day = day;
    }

    public void setBirthMonth(int month) {
        this.month = month;
    }

    public void setBirthYear(int year) {
        this.year = year;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public abstract double getPrice();

    public boolean checkIfEmpty(String firstName, String lastName, String ID){
        return (firstName == "" || lastName == ""|| ID == "");
    }
    //public abstract boolean isValidid();

    public String toString(){
        return "";
    }
    public boolean checkBirth(int day, int month, int year){
        if((day >  0 && day < 31)&&(month>0&&month<13)&&(year>0&&year<2019))
            return true;
        return false;
    }
}
