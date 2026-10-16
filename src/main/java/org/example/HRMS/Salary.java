package org.example.HRMS;

public class Salary {

    private double basic;
    private double da;
    private double hra;

    public Salary(double basic, double da, double hra) {
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }

    public double getBasic() {
        return basic;
    }

    public double getDa() {
        return da;
    }

    public double getHra() {
        return hra;
    }

    public double getConsolidatedSalary() {
        return basic + da + hra;
    }
}
