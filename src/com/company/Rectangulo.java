package com.company;

public class Rectangulo {
    int a,b;
    public Rectangulo (int a,int b) {
        this.a=a;
        this.b=b;
    }
    public int area () {

        int c = (a*b);
            return c;
    }
    public int perimetro(){

            int p = (a*2+b*2);
            return p;
        }

    }


