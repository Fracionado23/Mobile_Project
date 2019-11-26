package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatActivity extends AppCompatActivity {
    PieChart pieChart;
    int car_res = SecondActivity.car_price;
    int health_res = SecondActivity.health_price;
    int bill_res = SecondActivity.bill_price;
    int home_res = SecondActivity.home_price;
    int food_res = SecondActivity.food_price;
    int sport_res = SecondActivity.sport_price;
    int view_res = SecondActivity.view_price;
    int clothes_res = SecondActivity.clothes_price;
    int travel_res = SecondActivity.travel_price;
    int study_res = SecondActivity.study_price;
    int funny_res = SecondActivity.funny_price;
    int mobile_res = SecondActivity.mobile_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        pieChart = findViewById(R.id.pie);
        //Используем ввдённые данные, вместо процентов
        pieChart.setUsePercentValues(false);
        //Местоположение диаграммы
        pieChart.setExtraOffsets(5, 5, 5 ,5);
        //Рисовать круг по центру
        pieChart.setDrawHoleEnabled(true);
        //Белым цветом
        pieChart.setHoleColor(Color.WHITE);
        //Дополнительный круг в центре
        pieChart.setTransparentCircleRadius(60f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        //Если значение по какой-либо категории
        if(car_res != 0) {
            yValues.add(new PieEntry(car_res, "Авто"));
        }
        if(home_res != 0) {
            yValues.add(new PieEntry(home_res, "Дом"));
        }
        if(health_res != 0) {
            yValues.add(new PieEntry(health_res, "Здоровье"));
        }
        if(bill_res != 0) {
            yValues.add(new PieEntry(bill_res, "Коммуналка"));
        }
        if(food_res != 0) {
            yValues.add(new PieEntry(food_res, "Еда"));
        }
        if(sport_res != 0) {
            yValues.add(new PieEntry(sport_res, "Спорт"));
        }
        if(view_res != 0) {
            yValues.add(new PieEntry(view_res, "Внешний вид"));
        }
        if(clothes_res != 0) {
            yValues.add(new PieEntry(clothes_res, "Одежда"));
        }
        if(travel_res != 0) {
            yValues.add(new PieEntry(travel_res, "Путешествия"));
        }
        if(study_res != 0) {
            yValues.add(new PieEntry(study_res, "Образование"));
        }
        if(funny_res != 0) {
            yValues.add(new PieEntry(funny_res, "Развлечения"));
        }
        if(mobile_res != 0) {
            yValues.add(new PieEntry(mobile_res, "Связь"));
        }
        //Анимация "раскрытия" диаграммы
        pieChart.animateY(3000, Easing.EasingOption.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"");
        //Надпись под диаграммой
        Description desc = new Description();
        desc.setText("Расходы по категориям");
        desc.setTextSize(20f);
        pieChart.setDescription(desc);
        //Цвета для диаграммы
        dataSet.setColors(ColorTemplate.PASTEL_COLORS);
        //Цифры на диагрмме
        PieData data = new PieData(dataSet);
        data.setValueTextSize(15f);
        data.setValueTextColor(Color.BLACK);
        pieChart.setData(data);
    }
}
