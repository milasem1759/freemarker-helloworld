package com.mila_sem.freemarker.dto;

public class Office {

    private String city;
    private String address;
    private String phone;
    private String email;

    public Office() {
    }

    public Office(String city, String address, String phone, String email) {
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Office{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Office office = (Office) o;

        if (city != null ? !city.equals(office.city) : office.city != null) return false;
        return address != null ? address.equals(office.address) : office.address == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
