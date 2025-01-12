package TAIKHOAN;

import java.util.Scanner;

public class Position {

    private int id;
    PositionName name;

    public Position() {
    }

    public Position(int id, PositionName name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionName getName() {
        return name;
    }

    public void setName(PositionName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{" + "id=" + id + ", name=" + name + '}';
    } 
}
