package com.example.shoppinglist;

import java.util.Objects;

public class Contact {

    private String name;
    private long phone;
    private int serialNumber;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phone == contact.phone && serialNumber == contact.serialNumber && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, serialNumber);
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public Contact(String name, long phone, int serialNumber) {
        this.name = name;
        this.phone = phone;
        this.serialNumber = serialNumber;
    }
}
