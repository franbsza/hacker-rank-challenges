package com.challenges.basic;

/*
Time Conversion
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
      - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

s = '12:01:00PM'
Return '12:01:00'

s = '12:01:00AM'
Return '00:01:00'
*/

public class TimeConversion {

    public String solveQuestion(String time){
        String init = time.substring(0,2);
        String end = time.substring(8,10);
        String timeNew = "";

        if(end.equals("AM")){
            if(init.equals("12")){
                timeNew =  time.replace(init, "00").substring(0,8);
            }
            else{
                timeNew =  time.substring(0,8);
            }

        }
        if(end.equals("PM")){
            switch (init){
                case "01":
                    timeNew = time.replace(init, "13").substring(0,8);
                    break;
                case "02":
                    timeNew = time.replace(init, "14").substring(0,8);
                    break;
                case "03":
                    timeNew = time.replace(init, "15").substring(0,8);
                    break;
                case "04":
                    timeNew = time.replace(init, "16").substring(0,8);
                    break;
                case "05":
                    timeNew = time.replace(init, "17").substring(0,8);
                    break;
                case "06":
                    timeNew = time.replace(init, "18").substring(0,8);
                    break;
                case "07":
                    timeNew = time.replace(init, "19").substring(0,8);
                    break;
                case "08":
                    timeNew = time.replace(init, "20").substring(0,8);
                    break;
                case "09":
                    timeNew = time.replace(init, "21").substring(0,8);
                    break;
                case "10":
                    timeNew = time.replace(init, "22").substring(0,8);
                    break;
                case "11":
                    timeNew = time.replace(init, "23").substring(0,8);
                    break;
                case "12":
                    timeNew = time.substring(0,8);
                    break;
            }
        }

        return timeNew;
    }
}
