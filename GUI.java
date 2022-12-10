package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JFrame
{
    int operation = 0;
    ArrayList<String> operations = new ArrayList<String>();
    JPanel jpl;
    JTextField tf1;
    JTextField tf2;
    JButton btn1;
    JButton btn2;
    JLabel result;


    public GUI()
    {
        operations.add("*");
        operations.add("+");
        operations.add("-");
        operations.add("/");

        jpl = new JPanel(new FlowLayout());
        tf1 = new JTextField();
        tf2 = new JTextField();
        btn1 = new JButton("=");
        btn2 = new JButton("*");
        result = new JLabel("");


        tf1.setColumns(10);
        tf2.setColumns(10);

        jpl.add(tf1);
        jpl.add(btn2);
        jpl.add(tf2);
        jpl.add(btn1);
        jpl.add(result);

        init();

        add(jpl);
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void init()
    {
        btn1.addActionListener(e -> calculate());
        btn2.addActionListener(e -> changeOperation());
    }

    public void calculate()
    {
        double a = 2;
        double b = 2;
        double c = 0;
        a = Double.parseDouble(tf1.getText());
        b = Double.parseDouble(tf2.getText());
        if(operation == 0)
        {
            c = a * b;
        }
        if(operation == 1)
        {
            c = a + b;
        }
        if(operation == 2)
        {
            c = a - b;
        }
        if(operation == 3)
        {
            c = a / b;
        }
        result.setText(String.valueOf(c));
    }

    public void changeOperation()
    {
        operation++;
        if(operation == operations.size())
        {
            operation = 0;
        }
        btn2.setText(operations.get(operation));
    }

}
