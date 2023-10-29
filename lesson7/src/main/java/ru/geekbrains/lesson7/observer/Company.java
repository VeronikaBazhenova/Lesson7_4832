package ru.geekbrains.lesson7.observer;

import java.util.Arrays;
import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        Professions[] names = Professions.values();
        String profession = String.valueOf(names[random.nextInt(0,6)]);
        Vacancy vacancy = new Vacancy(profession);

        jobAgency.sendOffer(name, vacancy);
    }

}
