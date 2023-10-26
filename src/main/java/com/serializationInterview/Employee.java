package com.serializationInterview;

import java.io.Serializable;

public class Employee implements Serializable
{
    private int id;
    private transient int name;
    // i we add transient it will not serial the field and will also not add serialize


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

}
