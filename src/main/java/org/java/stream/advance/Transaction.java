package org.java.stream.advance;

public class Transaction {

    private String data;
    private int i;

    public Transaction(String data, int i) {
        this.data = data;
        this.i = i;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
