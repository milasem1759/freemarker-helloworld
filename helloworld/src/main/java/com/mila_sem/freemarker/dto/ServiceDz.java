package com.mila_sem.freemarker.dto;

public class ServiceDz {

    private String item;

    public ServiceDz() {
    }

    public ServiceDz(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ServiceDz{" +
                "item='" + item + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceDz serviceDz = (ServiceDz) o;

        return item != null ? item.equals(serviceDz.item) : serviceDz.item == null;
    }

    @Override
    public int hashCode() {
        return item != null ? item.hashCode() : 0;
    }
}
