package com.expandable.weekview;

import java.util.Calendar;

/**
 * Created by Thejan_Thrimanna on 4/18/2020.
 */
public interface DateTimeInterpreter {
    String interpretDate(Calendar date);
    String interpretTime(int hour);
}
