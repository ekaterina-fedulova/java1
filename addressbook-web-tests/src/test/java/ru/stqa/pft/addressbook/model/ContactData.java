package ru.stqa.pft.addressbook.model;
// данные для ввода в форму


public class ContactData {
  private int id;
  private final String firstName;
  private final String lastName;
  private final String phone;
  private final String mail;
  private String group;

  public ContactData(String FirstName, String LastName, String Phone, String mail, String group) {
    this.id = 0;
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
}
