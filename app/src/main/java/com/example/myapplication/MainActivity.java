package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Строки для педечи в другие активити
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    public static final String EXTRA_MESSAGE_IMAGE = "EXTRA_MESSAGE_IMAGE";
    //Сообщение для передачи,вынесено, как глобально,т.к. используется часто
    public String mess = "Расход";
    int res = SecondActivity.result;
    ImageButton Car,Plus,Minus,Home,Health,
                Food,Sport, View,Clothes,Travel,
                Study,Funny, Phone,Bill,Diagram;
    Button CheckBalance;
    TextView Calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Функция определения всех id
        FindId();
        //Функция для задания обработчика событий
        SetOnClick();
        //
        CheckBalance.setText("Мой баланс: " + Integer.toString(res));
        CheckBalance(res);
    }
    //Изменение цвета кнопки при нажатии
    void CheckBalance(int res)
    {
        if(res < 0){
            CheckBalance.setBackgroundColor(Color.RED);
        }
        if(res > 0)
        {
            CheckBalance.setBackgroundColor(Color.GREEN);
        }
        if(res == 0){
            CheckBalance.setBackgroundColor(Color.GRAY);
        }
    }
    //Функция определения всех id
    public void FindId()
    {
        Calendar = findViewById(R.id.dateandtime);
        Car = findViewById(R.id.btn_car);
        Plus = findViewById(R.id.btn_add_income);
        Minus = findViewById(R.id.btn_add_con);
        Home = findViewById(R.id.btn_home);
        Health = findViewById(R.id.btn_health);
        Food = findViewById(R.id.btn_food);
        Sport = findViewById(R.id.btn_sport);
        View = findViewById(R.id.btn_view);
        Clothes = findViewById(R.id.btn_clothes);
        Travel = findViewById(R.id.btn_travel);
        Study = findViewById(R.id.btn_study);
        Funny = findViewById(R.id.btn_funny);
        Phone = findViewById(R.id.btn_mobile);
        Bill = findViewById(R.id.btn_com);
        Diagram = findViewById(R.id.diagram);
        CheckBalance = findViewById(R.id.btn_look);
    }
    //Функция для задания обработчика событий
    public void SetOnClick(){
        Car.setOnClickListener(this);
        Plus.setOnClickListener(this);
        Home.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Health.setOnClickListener(this);
        Food.setOnClickListener(this);
        Sport.setOnClickListener(this);
        View.setOnClickListener(this);
        Clothes.setOnClickListener(this);
        Travel.setOnClickListener(this);
        Study.setOnClickListener(this);
        Funny.setOnClickListener(this);
        Phone.setOnClickListener(this);
        Bill.setOnClickListener(this);
        Diagram.setOnClickListener(this);
        CheckBalance.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_car:
                Intent intent_car = new Intent(this, SecondActivity.class);
                String mess_car = "Машина";
                intent_car.putExtra(EXTRA_MESSAGE,mess);
                //Сообщение для передачи
                intent_car.putExtra(EXTRA_MESSAGE_IMAGE,mess_car);
                startActivity(intent_car);
                break;
            case R.id.btn_home:
                Intent intent_house= new Intent(this, SecondActivity.class);
                String mess_house = "Дом";
                intent_house.putExtra(EXTRA_MESSAGE,mess);
                intent_house.putExtra(EXTRA_MESSAGE_IMAGE,mess_house);
                startActivity(intent_house);
                break;
            case R.id.btn_health:
                Intent intent_health= new Intent(this, SecondActivity.class);
                String mess_health= "Здоровье";
                intent_health.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_health.putExtra(EXTRA_MESSAGE_IMAGE,mess_health);
                startActivity(intent_health);
                break;
            case R.id.btn_food:
                Intent intent_food= new Intent(this, SecondActivity.class);
                String mess_food= "Еда";
                intent_food.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_food.putExtra(EXTRA_MESSAGE_IMAGE,mess_food);
                startActivity(intent_food);
                break;
            case R.id.btn_sport:
                Intent intent_sport= new Intent(this, SecondActivity.class);
                String mess_sport= "Спорт";
                intent_sport.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_sport.putExtra(EXTRA_MESSAGE_IMAGE,mess_sport);
                startActivity(intent_sport);
                break;
            case R.id.btn_view:
                Intent intent_view= new Intent(this, SecondActivity.class);
                String mess_view= "Внешний вид";
                intent_view.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_view.putExtra(EXTRA_MESSAGE_IMAGE,mess_view);
                startActivity(intent_view);
                break;
            case R.id.btn_clothes:
                Intent intent_clothes= new Intent(this, SecondActivity.class);
                String mess_clothes= "Одежда";
                intent_clothes.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_clothes.putExtra(EXTRA_MESSAGE_IMAGE,mess_clothes);
                startActivity(intent_clothes);
                break;
            case R.id.btn_travel:
                Intent intent_travel= new Intent(this, SecondActivity.class);
                String mess_travel= "Путешествия";
                intent_travel.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_travel.putExtra(EXTRA_MESSAGE_IMAGE,mess_travel);
                startActivity(intent_travel);
                break;
            case R.id.btn_study:
                Intent intent_study= new Intent(this, SecondActivity.class);
                String mess_study= "Образование";
                intent_study.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_study.putExtra(EXTRA_MESSAGE_IMAGE,mess_study);
                startActivity(intent_study);
                break;
            case R.id.btn_funny:
                Intent intent_funny= new Intent(this, SecondActivity.class);
                String mess_funny = "Развлечения";
                intent_funny.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_funny.putExtra(EXTRA_MESSAGE_IMAGE,mess_funny);
                startActivity(intent_funny);
                break;
            case R.id.btn_mobile:
                Intent intent_mobile= new Intent(this, SecondActivity.class);
                String mess_mobile= "Связь";
                intent_mobile.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_mobile.putExtra(EXTRA_MESSAGE_IMAGE,mess_mobile);
                startActivity(intent_mobile);
                break;
            case R.id.btn_com:
                Intent intent_com= new Intent(this, SecondActivity.class);
                String mess_com= "Коммуналка";
                intent_com.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent_com.putExtra(EXTRA_MESSAGE_IMAGE,mess_com);
                startActivity(intent_com);
                break;
            case R.id.btn_add_con:
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra(EXTRA_MESSAGE,mess);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent.putExtra(EXTRA_MESSAGE_IMAGE,mess);
                startActivity(intent);
                break;
            case R.id.btn_add_income:
                Intent intent2 = new Intent(this, SecondActivity.class);
                String mess2 = "Доход";
                intent2.putExtra(EXTRA_MESSAGE,mess2);
                //Передаём сообщение, чтобы в дальнейшем прекрепить картинку
                intent2.putExtra(EXTRA_MESSAGE_IMAGE,mess2);
                startActivity(intent2);
                break;
                //Переход в активити со списком
            case R.id.btn_look:
                Intent intent_look = new Intent(this, ListActivity.class);
                startActivity(intent_look);
                break;
                //Переход в активити с диаграммой
            case R.id.diagram:
                Intent intent1 = new Intent(this,StatActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
    //Выход из приложения
    public void onBackPressed() {
        //super.onBackPressed();
        onCreateDialog();
    }
    //Диалоговое окно для выхода
    public Dialog onCreateDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выход") //Заголовок окна
                .setMessage("Вы действительно хотите выйти?") //Сообщение
                .setIcon(R.drawable.car) //Картинка
                //"Позитивная" кнопка - выход из приложения
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        System.exit(1);
                    }
                });
        //"Негативная" кнопка - закрытие диалогово окна
        builder.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Закрываем окно
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        return builder.create();
    }
}
