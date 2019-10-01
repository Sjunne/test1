public class Address
{
  private String streetName;
  private int number;
  private String city;
  private int zip;

  public Address (String streetName, int number, String city, int zip)
  {
    this.streetName = streetName;
    this.number = number;
    this.city = city;
    this.zip = zip;

  }

  public String getStreet ()
  {
    return streetName + " " + getNumber();
  }

  public int getNumber()
  {
    return number;
  }

  public String getCity()
  {
    return city;
  }

  public int getZip()
  {
    return zip;
  }

  public Address copy ()
  {
    Address other;
    other = new Address(streetName, number, city, zip);
    return other;
  }

  public String toString()
  {
    return getStreet() + " " + city + " " + zip;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Address))
      return false;
    Address other = (Address) obj;
    return this.toString().equals(other.toString());
  }



}
