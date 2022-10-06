package Homework;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;

//Веселый рандомайзер високосный год или нет
public class Test4 {
    public static void main(String[] args) {
        int secPerYear = 60*60*60*24*365;
        //System.out.println("Не високосный"+":"+" "+secPerYear+"сек");
        int secPerVYear = 60*60*60*24*366;
        //System.out.println("Високосный"+":"+" "+secPerVYear+"сек");
        int generateYear = (int)Math.floor(Math.random()*(366-365+1)+365);
        if(generateYear < 366) {
            System.out.println("Вам попался не високосный год"+","+ " "+"в нем"+ " "+secPerYear+" "+"секунд");
        } else {
            System.out.println("Вам попался високосный год"+","+ " "+"в нем"+ " "+secPerVYear+" "+"секунд");
        }
        int diffYear = (secPerVYear - secPerYear);
        if (generateYear < 366){
            System.out.println("В нем на"+" "+diffYear+" "+"секунд меньше чем в високосном");
        }
        else {
            System.out.println("Это на"+" "+diffYear+" "+"секунд больше чем в не високосном");
        }
    }
}
