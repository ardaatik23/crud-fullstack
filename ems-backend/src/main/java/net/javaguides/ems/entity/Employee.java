package net.javaguides.ems.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "state_person")
    private String statePerson;

    @Column(name = "email_id")
    private String emailId;

    public Employee(Long id, String firstName, String lastName, String email, String personState) {

    }

    public Employee(String firstName,String lastName, String statePerson, String emailId) {
        super();
        this.firstName = firstName;
        this.statePerson = statePerson;
        this.emailId = emailId;
        this.lastName=lastName;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getStatePerson() {
        return statePerson;
    }
    public void setStatePerson(String statePerson) {
        this.statePerson = statePerson;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


}