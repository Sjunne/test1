public class Name
{
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public Name copy()
  {
    Name other;
    other = new Name(firstName, lastName);
    return other;
  }



  public boolean equals(Object obj)
  {
    if (!(obj instanceof Name))
      return false;

    Name other = (Name) obj;

    return this.lastName.equals(other.getLastName()) && this.firstName.equals(other.getFirstName());
  }


}
