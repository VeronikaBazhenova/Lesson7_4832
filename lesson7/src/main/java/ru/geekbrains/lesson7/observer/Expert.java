package ru.geekbrains.lesson7.observer;

public class Expert implements Observer{
    private String name;
    private int salary = 100000;
    public Expert(String name){this.name=name;}
    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.minSalary){
            System.out.printf("Эксперт %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.minSalary);
            this.salary = vacancy.minSalary;

        }
        else {
            System.out.printf("Эксперт %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.minSalary);
        }

    }
}
