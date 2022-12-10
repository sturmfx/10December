package com.company;

import javax.swing.*;
import java.awt.*;

public class Calc extends JPanel
{
    String a = "";
    String b = "";
    boolean first_number = true;
    int operation = 0; //0 is plus, 1 is minus, 2 is multyply, 3 is divide
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnP;

    JButton mult;
    JButton divide;
    JButton plus;
    JButton minus;
    JButton reset;
    JButton equal;

    JLabel result;

    public Calc()
    {
        setLayout(new GridLayout(0,3));
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnP = new JButton(".");
        mult = new JButton("*");
        divide = new JButton("/");
        plus = new JButton("+");
        minus = new JButton("-");
        reset = new JButton("C");
        equal = new JButton("=");
        result = new JLabel(a);
        init();
    }

    public void init()
    {
        btn0.addActionListener(e -> add("0"));
        btn1.addActionListener(e -> add("1"));
        btn2.addActionListener(e -> add("2"));
        btn3.addActionListener(e -> add("3"));
        btn4.addActionListener(e -> add("4"));
        btn5.addActionListener(e -> add("5"));
        btn6.addActionListener(e -> add("6"));
        btn7.addActionListener(e -> add("7"));
        btn8.addActionListener(e -> add("8"));
        btn9.addActionListener(e -> add("9"));
        btnP.addActionListener(e -> add("."));

        plus.addActionListener(e -> change_number());
        minus.addActionListener(e -> change_number());
        mult.addActionListener(e -> change_number());
        divide.addActionListener(e -> change_number());

        reset.addActionListener(e -> reset_all());

        add(result);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btnP);
        add(plus);
        add(minus);
        add(mult);
        add(divide);
        add(reset);
        add(equal);
    }

    public void add(String s)
    {
        if(first_number)
        {
            a = a + s;
            result.setText(a);
        }
        else
        {
            b = b + s;
            result.setText(b);
        }
    }

    public void change_number()
    {
        first_number = false;
        result.setText("");;
    }

    public void reset_all()
    {
        a = "";
        b = "";
        first_number = true;
        result.setText("");;
    }

    public void equal()
    {
        double aa = 2;
        double bb = 2;
        double c = 1;
        aa = Double.parseDouble(a);
        bb = Double.parseDouble(b);
    }
}
