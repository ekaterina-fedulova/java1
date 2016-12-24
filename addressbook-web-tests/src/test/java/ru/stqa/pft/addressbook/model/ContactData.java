package ru.stqa.pft.addressbook.model;
// данные для ввода в форму


public class ContactData {
  private final String id;
  private final String firstName;
  private final String lastName;
  private final String phone;
  private final String mail;
  private String group;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }

  public ContactData(String FirstName, String LastName, String Phone, String mail, String group) {
    this.id = null;
    this.firstName = FirstName;
    this.lastName = LastName;
    this.phone = Phone;
    this.mail = mail;
    this.group = group;
  }

  public ContactData(String id, String FirstName, String LastName, String Phone, String mail, String group) {
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

  public String getId() { return id; }
}
