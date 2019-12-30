
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Person
{
    /**
     * Method that gets the first name of a person.
     *
     * @param  
     * 
     * @return    
     */

    public String getFirstName();

    public String getLastName();

    public String getId();

    public Sex getSex();

    public int getBirthDay();

    public int getBirthMonth();

    public int getBirthYear();

    public void setFirstName(String firstName);

    public void setLastName(String lastName);

    public void setId(String id);

    public void setSex(Sex sex);

    public void setBirthDay(int day);

    public void setBirthMonth(int month);

    public void setBirthYear(int year);

    public String toString();

}
