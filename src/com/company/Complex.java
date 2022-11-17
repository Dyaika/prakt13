package com.company;

public class Complex {
    private int real;
    private int image;
    public Complex(int a, int b) {
        real = a;
        image = b;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(real);
        if (image < 0) {
            res.append(image).append('i');
        } else {
            res.append('+').append(image).append('i');
        }
        return res.toString();
    }
}
