package main;

public class Parrot {
    public String name = "Koko";

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Parrot: " + name;
    }
}
