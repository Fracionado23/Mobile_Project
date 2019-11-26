package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ListActivity extends AppCompatActivity {
    private List<State> states = new ArrayList();
    //Значения для каждой категории
    String Money_car = Integer.toString(SecondActivity.car_price);
    String Money_health = Integer.toString(SecondActivity.health_price);
    String Money_bill = Integer.toString(SecondActivity.bill_price);
    String Money_home = Integer.toString(SecondActivity.home_price);
    String Money_food = Integer.toString(SecondActivity.food_price);
    String Money_sport = Integer.toString(SecondActivity.sport_price);
    String Money_view = Integer.toString(SecondActivity.view_price);
    String Money_clothes = Integer.toString(SecondActivity.clothes_price);
    String Money_travel = Integer.toString(SecondActivity.travel_price);
    String Money_funny = Integer.toString(SecondActivity.funny_price);
    String Money_mobile = Integer.toString(SecondActivity.mobile_price);
    String Money_add = Integer.toString(SecondActivity.add_price);
    String Money_con = Integer.toString(SecondActivity.con_price);
    String Money_study = Integer.toString(SecondActivity.study_price);
    ListView categoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        categoryList = findViewById(R.id.countriesList);
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item, states);
        categoryList.setAdapter(stateAdapter);
    }
    //Если значение 0, тогда значение в список не добавляется
    private void setInitialData() {
        if(Integer.parseInt(Money_add) != 0){
                states.add(new State(GetDateAndTime(), SecondActivity.Note_add, Money_add, R.drawable.plus));
        }
        if(Integer.parseInt(Money_con) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_sub,Money_con, R.drawable.sub));
        }
        if (Integer.parseInt(Money_car) != 0) {
            states.add(new State(GetDateAndTime(),SecondActivity.Note_car,Money_car, R.drawable.car));
        }
        if(Integer.parseInt(Money_food) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_food,Money_food, R.drawable.food));
        }
        if(Integer.parseInt(Money_health) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_health,Money_health, R.drawable.heatlh));
        }
        if(Integer.parseInt(Money_view) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_view,Money_view, R.drawable.vheska));
        }
        if(Integer.parseInt(Money_clothes) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_clothes,Money_clothes, R.drawable.clothes));
        }
        if(Integer.parseInt(Money_sport) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_sport,Money_sport, R.drawable.sport));
        }
        if(Integer.parseInt(Money_mobile) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_mobile,Money_mobile, R.drawable.mobile));
        }
        if(Integer.parseInt(Money_funny) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_funny,Money_funny, R.drawable.teather));
        }
        if(Integer.parseInt(Money_travel) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_travel,Money_travel, R.drawable.travel));
        }
        if(Integer.parseInt(Money_home) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_home,Money_home, R.drawable.home));
        }
        if(Integer.parseInt(Money_bill) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_bill,Money_bill, R.drawable.kommunalka));
        }
        if(Integer.parseInt(Money_study) != 0){
            states.add(new State(GetDateAndTime(),SecondActivity.Note_study,Money_study, R.drawable.styding));
        }
    }
    //Получение даты
    public String GetDateAndTime()
    {
        // Текущее время
        Date currentDate = new Date();
        // Форматирование времени как "день.месяц.год"
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
        String TimeDate = dateText;
        return TimeDate;
    }
}
