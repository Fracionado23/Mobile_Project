package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {

    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public StateAdapter(Context context, int resource, List<State> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        //Создаём объект View для каждого отдельного элемента в списке
        View view = inflater.inflate(this.layout, parent, false);
        //Из объекта получаем данные
        ImageView flagView = (ImageView) view.findViewById(R.id.category);
        TextView dateView = (TextView) view.findViewById(R.id.date);
        TextView noteView = (TextView) view.findViewById(R.id.note);
        TextView moneyView = (TextView) view.findViewById(R.id.money);
        //Далее используя параметр position, получаем объект State, для которого создается разметка
        State state = states.get(position);
        //Затем полученные элементы ImageView и TextView наполняем из полученного по позиции объекта State:
        flagView.setImageResource(state.getFlagResource());
        dateView.setText(state.getDate());
        noteView.setText(state.getNote());
        moneyView.setText(state.getMoney());
        //И в конце созданный для отображения объекта State элемент View возвращается из метода
        return view;
    }

}
