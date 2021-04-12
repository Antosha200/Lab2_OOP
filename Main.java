package com.company;

import java.util.Scanner;

public class Main {
// лаба 2
    static void Dinosaur()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу динозавтра в граммах");
        float weight = scanner.nextFloat();
        double killograms = weight/1000;
        double centners = killograms/100;
        double tonns = centners/10;
        System.out.println("Масса данного динозавра:"+"\n"+"в килограммах= "+ killograms+"\n"+"В центнерах="+centners+"\n"+ "в тоннах="+tonns);
    }

    static void Size()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер файла в байтах");
        float sizebytes = scanner.nextFloat();
        float sizekilobytes = sizebytes/1_024;
        float sizemegabytes = sizebytes/1_048_576;
        System.out.println("Размер данного файла"+"\n"+"в килобайтах= "+sizekilobytes+"\n"+"В мегабайтах="+sizemegabytes);
    }

    static void Distance()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние в сантиметрах");
        float distsant = scanner.nextFloat();
        float distmetrs = distsant/100;
        float distkilometrs = distsant/10_000;
        System.out.println("Расстояние в метрах: " + distmetrs+"\n"+"Расстояние в километрах: " + distkilometrs);

    }

    static void ChangePlace()
    {
        short a = 1;
        short b = 0;
        a = (short) (a + b);
        b = (short) (b - a);
        b = (short) -b;
        a = (short) (a - b);
        System.out.println(a+" "+b);
    }

    static void Sweets()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость шоколадных конфет и сколько кг будет куплено");
        float price = scanner.nextFloat();
        float weight = scanner.nextFloat();
        float for1 = price/weight;
        System.out.println("Введите стоимость желатинок и сколько кг будет куплено");
        price = scanner.nextFloat();
        weight = scanner.nextFloat();
        float for2=price/weight;
        float dif = for2/for1;

        System.out.println("Стоимость шоколадных конфет за килограмм - "+for1+", а желатинок - "+for2+"\n"+"Желатинки дороже в "+dif);

    }


    public static void main(String[] args)
    {

        Dinosaur();
        Size();
        Distance();
        ChangePlace();
        Sweets();

    }
}

