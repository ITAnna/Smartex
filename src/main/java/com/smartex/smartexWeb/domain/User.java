package com.smartex.smartexWeb.domain;


import javax.persistence.*;

@Entity
@Table(name = "m_user")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private Long id;

    private String name;
    private String surname;
    private String email;
    private Long roleId;
    private String login;
    private String password;

    public User() {
    }

    public User(String name, String surname, String email, String login) {
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.login = login;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
