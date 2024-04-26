package edu.sharif.test.quize.questions;

public class BinaryDto {
    int s; //sign
    String b; //binary

    public BinaryDto(int s, String b) {
        this.s = s;
        this.b = b;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
