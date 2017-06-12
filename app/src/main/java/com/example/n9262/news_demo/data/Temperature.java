package com.example.n9262.news_demo.data;

import java.util.Date;

/**
 * Created by n9262 on 2017/6/12.
 */

public class Temperature {
    public   int low;
    public  int high;
    public Date mDate;

    public Temperature(int low, int high, Date mDate) {
        this.high = high;
        this.low = low;
        this.mDate = mDate;
    }
}
