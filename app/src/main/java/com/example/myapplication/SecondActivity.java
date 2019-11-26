package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    public static TextView title;
    public TextView Balance;
    public static int result;
    public static String
            Note_car,Note_food,Note_health,Note_bill,
            Note_home,Note_sport,Note_view,Note_clothes,
            Note_travel,Note_study,Note_funny,Note_mobile,Note_add,Note_sub;
    public static int
            car_price,health_price,bill_price,
            home_price,food_price,sport_price,view_price,
            clothes_price,travel_price,study_price,funny_price,mobile_price,add_price,con_price;
    StringBuffer stringBuffer = new StringBuffer();
    Button One,Two ,Three, Four, Five, Six, Seven, Eight, Nine, Zero, Zerox3,Add;
    ImageButton Clear,Back;
    TextView note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        //Главные текст
        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_IMAGE);
        title = findViewById(R.id.mainLabel);
        title.setText(message1);
        //Кнопки
        Balance = findViewById(R.id.balance);
        One = findViewById(R.id.numberOne);
        One.setOnClickListener(this);
        Two = findViewById(R.id.numberTwo);
        Two.setOnClickListener(this);
        Three = findViewById(R.id.numberThree);
        Three.setOnClickListener(this);
        Four = findViewById(R.id.numberFour);
        Four.setOnClickListener(this);
        Five = findViewById(R.id.numberFive);
        Five.setOnClickListener(this);
        Six = findViewById(R.id.numberSix);
        Six.setOnClickListener(this);
        Seven = findViewById(R.id.numberSeven);
        Seven.setOnClickListener(this);
        Eight = findViewById(R.id.numberEight);
        Eight.setOnClickListener(this);
        Nine = findViewById(R.id.numberNine);
        Nine.setOnClickListener(this);
        Zero = findViewById(R.id.numberZero);
        Zero.setOnClickListener(this);
        Zerox3 = findViewById(R.id.numberZeroZeroZero);
        Zerox3.setOnClickListener(this);
        Clear = findViewById(R.id.backspace);
        Clear.setOnClickListener(this);
        Add = findViewById(R.id.Add_btn);
        Add.setOnClickListener(this);
        Back = findViewById(R.id.back);
        Back.setOnClickListener(this);
        note = findViewById(R.id.note);
        //Проверка на сообщение, которое подаётся по нажатию на кнопку
        if (message1.equals("Доход")) {
            Drawable img = getResources().getDrawable(R.drawable.plus);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
        }
        if (message1.equals("Расход")) {
            Drawable img = getResources().getDrawable(R.drawable.sub);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
        }
        if (message2.equals("Машина")) {
            Drawable img = getResources().getDrawable(R.drawable.car);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Машина'");
        }
        if (message2.equals("Дом")) {
            Drawable img = getResources().getDrawable(R.drawable.home);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Дом'");
        }
        if (message2.equals("Здоровье")) {
            Drawable img = getResources().getDrawable(R.drawable.heatlh);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Здоровье'");
        }
        if (message2.equals("Еда")) {
            Drawable img = getResources().getDrawable(R.drawable.food);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Note_food = note.getText().toString();
            Add.setText("Добавить 'Еда'");
        }
        if (message2.equals("Спорт")) {
            Drawable img = getResources().getDrawable(R.drawable.sport);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Спорт'");
        }
        if (message2.equals("Внешний вид")) {
            Drawable img = getResources().getDrawable(R.drawable.vheska);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Внешний вид'");
        }
        if (message2.equals("Одежда")) {
            Drawable img = getResources().getDrawable(R.drawable.clothes);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Одежда'");
        }
        if (message2.equals("Путешествия")) {
            Drawable img = getResources().getDrawable(R.drawable.travel);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Путешествия'");
        }
        if (message2.equals("Образование")) {
            Drawable img = getResources().getDrawable(R.drawable.styding);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Образование'");
        }
        if (message2.equals("Связь")) {
            Drawable img = getResources().getDrawable(R.drawable.mobile);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Связь'");
        }
        if (message2.equals("Коммуналка")) {
            Drawable img = getResources().getDrawable(R.drawable.kommunalka);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Коммуналка'");
        }
        if (message2.equals("Развлечения")) {
            Drawable img = getResources().getDrawable(R.drawable.teather);
            img.setBounds(0, 0, 70, 70);
            title.setCompoundDrawables(img, null, null, null);
            Add.setText("Добавить 'Развлечения'");
        }
    }
    //Добавляем значение в result - баланс
    public int ChangeMoney() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if(message.equals("Доход")) {
            result += Integer.parseInt(Balance.getText().toString());
            return result;
        }
        if(message.equals("Расход")) {
            result -= Integer.parseInt(Balance.getText().toString());
            return result;
        }
        return 0;
    }
    //Добавляем значение по каждой категории, используется для списка
    public int ChangeCategoryMoney()
    {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_IMAGE);
        if (message.equals("Расход") && message2.equals("Машина")) {
            car_price += Integer.parseInt(Balance.getText().toString());
            return car_price;
        }
        if (message.equals("Расход") && message2.equals("Здоровье")) {
            health_price += Integer.parseInt(Balance.getText().toString());
            return health_price;
        }
        if (message.equals("Расход") && message2.equals("Коммуналка")) {
            bill_price += Integer.parseInt(Balance.getText().toString());
            return bill_price;
        }
        if (message.equals("Расход") && message2.equals("Дом")) {
            home_price += Integer.parseInt(Balance.getText().toString());
            return home_price;
        }
        if (message.equals("Расход") && message2.equals("Еда")) {
        food_price += Integer.parseInt(Balance.getText().toString());
        return food_price;
        }
        if (message.equals("Расход") && message2.equals("Спорт")) {
            sport_price += Integer.parseInt(Balance.getText().toString());
            return sport_price;
        }
        if (message.equals("Расход") && message2.equals("Внешний вид")) {
            view_price += Integer.parseInt(Balance.getText().toString());
            return view_price;
        }
        if (message.equals("Расход") && message2.equals("Одежда")) {
            clothes_price += Integer.parseInt(Balance.getText().toString());
            return clothes_price;
        }
        if (message.equals("Расход") && message2.equals("Путешествия")) {
            travel_price += Integer.parseInt(Balance.getText().toString());
            return travel_price;
        }
        if (message.equals("Расход") && message2.equals("Образование")) {
            study_price += Integer.parseInt(Balance.getText().toString());
            return study_price;
        }
        if (message.equals("Расход") && message2.equals("Развлечения")) {
            funny_price += Integer.parseInt(Balance.getText().toString());
            return funny_price;
        }
        if (message.equals("Расход") && message2.equals("Связь")) {
            mobile_price += Integer.parseInt(Balance.getText().toString());
            return mobile_price;
        }
        if(message.equals("Доход")) {
            add_price += Integer.parseInt(Balance.getText().toString());
            return add_price;
        }
        if(message.equals("Расход")) {
            con_price -= Integer.parseInt(Balance.getText().toString());
            return con_price;
        }
        return 0;
    }
    //Берём запись, оставленную
    // пользователем запись, используется для списка
    public String ChangeCategoryNote()
    {
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_IMAGE);
        if (message.equals("Расход") && message2.equals("Машина")) {
            Note_car = note.getText().toString();
            return Note_car;
        }
        if (message.equals("Расход") && message2.equals("Еда")) {
            Note_food = note.getText().toString();
            return Note_food;
        }
        if (message.equals("Расход") && message2.equals("Коммуналка")) {
            Note_bill = note.getText().toString();
            return Note_bill;
        }
        if (message.equals("Расход") && message2.equals("Дом")) {
            Note_home = note.getText().toString();
            return Note_home;
        }
        if (message.equals("Расход") && message2.equals("Здоровье")) {
            Note_health = note.getText().toString();
            return Note_health;
        }
        if (message.equals("Расход") && message2.equals("Спорт")) {
            Note_sport = note.getText().toString();
            return Note_sport;
        }
        if (message.equals("Расход") && message2.equals("Внешний вид")) {
            Note_view = note.getText().toString();
            return Note_view;
        }
        if (message.equals("Расход") && message2.equals("Одежда")) {
            Note_clothes = note.getText().toString();
            return Note_clothes;
        }
        if (message.equals("Расход") && message2.equals("Путешествия")) {
            Note_travel = note.getText().toString();
            return Note_travel;
        }
        if (message.equals("Расход") && message2.equals("Образование")) {
            Note_study = note.getText().toString();
            return Note_study;
        }
        if (message.equals("Расход") && message2.equals("Развлечения")) {
            Note_funny = note.getText().toString();
            return Note_funny;
        }
        if (message.equals("Расход") && message2.equals("Связь")) {
            Note_mobile = note.getText().toString();
            return Note_mobile;
        }
        if(message.equals("Доход")) {
            Note_add = note.getText().toString();
            return Note_add;
        }
        if(message.equals("Расход")) {
            Note_sub = note.getText().toString();
            return Note_sub;
        }
        return "";
    }
    //Реализация "клавиатуры"
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.numberOne:
                stringBuffer.append("1");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberTwo:
                stringBuffer.append("2");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberThree:
                stringBuffer.append("3");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberFour:
                stringBuffer.append("4");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberFive:
                stringBuffer.append("5");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberSix:
                stringBuffer.append("6");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberSeven:
                stringBuffer.append("7");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberEight:
                stringBuffer.append("8");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberNine:
                stringBuffer.append("9");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberZero:
                stringBuffer.append("0");
                Balance.setText(stringBuffer);
                break;
            case R.id.numberZeroZeroZero:
                    stringBuffer.append("000");
                    Balance.setText(stringBuffer);
                break;
            case R.id.backspace:
                Balance.setText(DeleteLastsymbol(stringBuffer.toString()));
                break;
            case R.id.Add_btn:
                onCreateDialog();
                break;
            case R.id.back:
                Intent intent2 = new Intent(this,MainActivity.class);
                startActivity(intent2);
                finish();
                break;
            default:
                break;
        }
    }
    //Функция, которая позволят удалять последний символ
    public String DeleteLastsymbol(String Text)
    {
        if(stringBuffer.length() != 0)
        {
            stringBuffer.delete(Text.length() - 1, Text.length());
            return stringBuffer.toString();
        }
        else
            return stringBuffer.append("").toString();
    }
    //Диалоговое окно
    public Dialog onCreateDialog() {
        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
        if (message1.equals("Доход")) {
            builder
                    .setIcon(R.drawable.plus)
                    .setMessage("Добавить доход?")
                    .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ChangeMoney();
                            ChangeCategoryMoney();
                            ChangeCategoryNote();
                            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }
                    });
        }
            if (message1.equals("Расход")) {
                builder
                        .setIcon(R.drawable.sub)
                        .setMessage("Добавить расход?")
                        .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                                ChangeMoney();
                                ChangeCategoryMoney();
                                ChangeCategoryNote();
                                //FLAG_ACTIVITY_NEW_TASK — запускает Activity в новом таске.
                                // Если уже существует таск с экземпляром данной Activity, то этот таск становится активным
                                //FLAG_ACTIVITY_CLEAR_TOP — если экземпляр данной Activity уже существует в стеке данного таска,
                                // то все Activity, находящиеся поверх нее разрушаются и этот экземпляр становится вершиной стека.
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                            }
                        });
            }
        builder.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        return builder.create();
    }
}
