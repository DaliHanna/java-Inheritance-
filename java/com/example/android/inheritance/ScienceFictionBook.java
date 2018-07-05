package com.example.android.inheritance;

public class ScienceFictionBook extends Book {
    ScienceFictionBook(){
        //write super() here
        info(10);
    }

    @Override
    public void info(int number) {
        super.info(number);
    }
}
