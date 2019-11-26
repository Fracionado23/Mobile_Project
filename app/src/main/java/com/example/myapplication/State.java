package com.example.myapplication;

public class State {
    private String Date; // Дата
    private String Note;  // Заметка
    private String Money; //Деньги
    private int flagResource; // ресурс флага

    public State(String Date, String Note,String Money, int flag) {

        this.Date = Date;
        this.Note = Note;
        this.Money = Money;
        this.flagResource = flag;

    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getNote() {
        return this.Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
    public String getMoney() {
        return this.Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
    public String getNull() {
        return "";
    }
}
