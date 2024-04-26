package edu.sharif.test.quize.questions;

public class DivDto {
    private int q;
    private int s;
    private int r;

    public DivDto(int s, int q, int r) {
        this.q = q;
        this.s = s;
        this.r = r;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
