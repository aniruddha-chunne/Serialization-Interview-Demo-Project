package com.serializationInterview;

import java.io.*;

public class EmployeeExternalization implements Externalizable
{


    private int id;
    private int name;
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
        return "EmployeeExternalization{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(id);
        out.write(name);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         id  = in.readInt();
    }
}
