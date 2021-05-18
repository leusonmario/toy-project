import java.util.Calendar;

public class Person {
  private String name;
  private int birthYear;

  public Person(String name, int birthYear){
    this.name = name;
    this.birthYear = birthYear;
  }

  public String getName(){
    return this.name;
  }
  
  public void setName(String newName){
    this.name = newName;  
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public boolean isTeenager(){
    return (Calendar.getInstance().get(Calendar.YEAR) - this.birthYear < 18) ? true : false;
  }

}
