package com.openclassrooms.realestatemanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.openclassrooms.realestatemanager.utils.convertDollarToEuro;
import static com.openclassrooms.realestatemanager.utils.convertEuroToDollar;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class UnitTest {

    @Test
    public void convertDollarToEuro_2dollars(){
        int dollars = 2;
        int euros = convertDollarToEuro(dollars);
        assertEquals(2,euros);
    }

    @Test
    public void convertEuroToDollar_5euros(){
        int euros = 5;
        int dollars = convertEuroToDollar(euros);
        assertEquals(6,dollars);
    }

    @Test
    public void getTodayDate_test(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todayDate = Utils.getTodayDate();
        assertEquals(dateFormat.format(new Date()),todayDate);

    }

}