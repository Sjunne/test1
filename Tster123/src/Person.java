public class Person
{
  private char gender;
  private Name name;

  public Person(Name name, char gender)
  {
    this.name = new Name(name.getFirstName(), name.getLastName());
    this.gender = gender;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public void setName(String firstName, String lastName)
  {
    this.name = new Name(firstName, lastName);
  }

  public Name getName()
  {
    return this.name;
  }

  public String getFullName()
  {
    return this.name.getFullName();
  }

  public boolean isFemale()
  {
    return gender != 'M' && gender != 'm';
  }

  public String toString()
  {
    if (gender == 'm' || gender == 'M')
      return "Person is a man and hes name is: " + name;
    else
      return "Person is a lady and her name is: " + name;
  }

  public boolean equals(Object obj)
  {
     if (!(obj instanceof Person))
       return false;
     Person other = (Person) obj;
     return this.toString().equals(other.toString());

  }



}
