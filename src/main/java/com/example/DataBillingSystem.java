package com.example;

public class DataBillingSystem {

    public double calculateBill(String plan, double dataUsage) {

        double bill = 0;

        if (plan.equalsIgnoreCase("basic")) {

            double baseCharge = 299;
            double dataLimit = 10;
            double extraCharge = 20;

            bill = baseCharge;

            if (dataUsage > dataLimit) {
                bill = bill + (dataUsage - dataLimit) * extraCharge;
            }

        } else if (plan.equalsIgnoreCase("standard")) {

            double baseCharge = 499;
            double dataLimit = 25;
            double extraCharge = 15;

            bill = baseCharge;

            if (dataUsage > dataLimit) {
                bill = bill + (dataUsage - dataLimit) * extraCharge;
            }

        } else if (plan.equalsIgnoreCase("premium")) {

            double baseCharge = 799;
            double dataLimit = 50;
            double extraCharge = 10;

            bill = baseCharge;

            if (dataUsage > dataLimit) {
                bill = bill + (dataUsage - dataLimit) * extraCharge;
            }

        } else {
            return -1;
        }

        return bill;
    }
}
