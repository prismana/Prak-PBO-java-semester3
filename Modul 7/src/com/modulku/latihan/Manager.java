package com.modulku.latihan;

public class Manager extends Karyawan{
    private float workTime = 6.5f;

    public void setWorkTime(float workTime){
        this.workTime = workTime;
    }

    public float getWorkTime(){
        return workTime;
    }

    public float getManagerSalary(){
        return getSalary() * 2;
    }
}
