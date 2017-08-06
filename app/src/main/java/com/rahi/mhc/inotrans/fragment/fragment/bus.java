package com.rahi.mhc.inotrans.fragment.fragment;

/**
 * Created by MHC on 7/20/2016.
 */

public class bus {
    private int id;
    private  String busname;
    private  String busnumber;
    private  String stop1;
    private  String stop10;
    private  String time1;
    private  String time10;


    public bus(int id, String busname, String busnumber, String stop1, String stop10, String time1, String time10) {
        this.id = id;
        this.busname = busname;
        this.busnumber = busnumber;
        this.stop1 = stop1;
        this.stop10 = stop10;
        this.time1 = time1;
        this.time10 = time10;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        this.busnumber = busnumber;
    }

    public String getStop1() {
        return stop1;
    }

    public void setStop1(String stop1) {
        this.stop1 = stop1;
    }

    public String getStop10() {
        return stop10;
    }

    public void setStop10(String stop10) {
        this.stop10 = stop10;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime10() {
        return time10;
    }

    public void setTime10(String time10) {
        this.time10 = time10;
    }
}
