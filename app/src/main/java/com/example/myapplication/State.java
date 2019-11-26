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

    public String getDate() { return this.Date; }
    public String getNote() { return this.Note; }
    public String getMoney() { return this.Money; }
    public int getFlagResource() { return this.flagResource; }
}
