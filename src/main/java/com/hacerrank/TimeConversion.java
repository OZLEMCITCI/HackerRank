package com.hacerrank;
public class TimeConversion {
    public static String timeConversion(String currentDate) {
        //split given String and put each into a String array
        String CurrentDateArr[] = currentDate.split(":");
        //Get am or pm part of the String
        String AmPm = CurrentDateArr[2].substring(2,4);
        //initilaize int to store hour, min and sec
        int hh,mm,ss;
        //get hour from the array
        hh = Integer.parseInt(CurrentDateArr[0]);
        String checkPM = "PM",checkAM ="AM";
        int h = hh;
        //set the hour base on am or pm
        if(AmPm.equals(checkAM) && hh==12)
            h=0;
        else if(AmPm.equals(checkPM)&& hh<12)
            //if pm we add 12 to it
            h+=12;
        //convert int hour to String and set "0" front of it base on the condition
        String h1;
        if(h<10) {
            h1="0"+h;}
        else{
            h1=h+"";}
        //get min from the array
        mm = Integer.parseInt(CurrentDateArr[1]);
        //convert int min to String and set "0" front of it base on the condition
        String mm1;
        if(mm<10) {
            mm1="0"+mm;}
        else{
            mm1=mm+"";}
        //get sec from the array
        ss = Integer.parseInt(CurrentDateArr[2].substring(0,2));
        //convert int sec to String and set "0" front of it base on the condition
        String s1;
        if(ss<10) {
            s1="0"+ss;}
        else{
            s1=ss+"";}
        //concat hour, min and sec, and return
        return h1+":"+mm1+":"+s1;
    }
}
