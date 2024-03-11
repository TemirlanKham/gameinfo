package main;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    public String name = "Emi";
    @Autowired
    public Parrot parrot;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setParrot(Parrot parrot){
        this.parrot=parrot;
    }
    public Parrot getParrot(){
        return parrot;
    }
}
