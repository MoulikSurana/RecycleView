package com.example.recycleview;

public class Contact {
    private String name,email,ima;

    public Contact(String name, String email, String ima) {
        this.name = name;
        this.email = email;
        this.ima = ima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ima='" + ima + '\'' +
                '}';
    }
}
