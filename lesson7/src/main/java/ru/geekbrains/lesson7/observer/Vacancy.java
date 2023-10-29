package ru.geekbrains.lesson7.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static ru.geekbrains.lesson7.factory.Program.random;

public class Vacancy {
    public String name;
    public int minSalary;
    public int maxSalary;

    public Vacancy(String name){
        this.name = name;
        Random random= new Random();
        this.minSalary = random.nextInt(2000, 60000);
        this.maxSalary = random.nextInt(5000, 110000);

    }

}
