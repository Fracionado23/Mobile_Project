package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
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
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5, 10, 5 ,5);
        pieChart.setDragDecelerationFrictionCoef(0.99f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
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

        pieChart.animateY(2500, Easing.EasingOption.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"");

        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.PASTEL_COLORS);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(15f);
        data.setValueTextColor(Color.BLACK);
        pieChart.setData(data);

    }
}
