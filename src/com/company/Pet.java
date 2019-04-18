package com.company;

public abstract class Pet {

    private String myName;

    public Pet(String myName)
    {
        this.myName=myName;
    }
    public String speak()
    {

        String speak="";
        return speak;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
