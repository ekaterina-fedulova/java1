package ru.stqa.pft.addressbook.model;
// 10 задание

public class ContactData {
  private int id;
  private final String firstName;
  private final String lastName;
  private final String phone;
  private final String mail;
  private String group;

  public ContactData(String FirstName, String LastName, String Phone, String mail, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstName = FirstName;
    this.lastName = LastName;
    this.phone = Phone;
    this.mail = mail;
    this.group = group;
  }

  public ContactData(int id, String FirstName, String LastName, String Phone, String mail, String group) {
    this.id = id;
    this.firstName = FirstName;
    this.lastName = LastName;
    this.phone = Phone;
    this.mail = mail;
    this.group = group;
  }

  public String getFirstName() { return firstName; }

  public String getLastName() {
    return lastName;
  }

  public String getPhone() {
    return phone;
  }

  public String getMail() {
    return mail;
  }

  public String getGroup() {
    return group;
  }

  public int getId() { return id; }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;

  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }
}
