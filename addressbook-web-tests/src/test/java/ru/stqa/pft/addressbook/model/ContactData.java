package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String phone;
  private final String mail;

  public ContactData(String FirstName, String LastName, String Phone, String mail) {
    firstName = FirstName;
    lastName = LastName;
    phone = Phone;
    this.mail = mail;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPhone() {
    return phone;
  }

  public String getMail() {
    return mail;
  }
}
