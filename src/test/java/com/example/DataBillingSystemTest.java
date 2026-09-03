
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataBillingSystemTest {

    @Test
    public void testBasicPlanWithinLimit() {

        DataBillingSystem system = new DataBillingSystem();

        assertEquals(299, system.calculateBill("basic", 5), 0.01);
    }

    @Test
    public void testBasicPlanWithExtraUsage() {

        DataBillingSystem system = new DataBillingSystem();

        assertEquals(359, system.calculateBill("basic", 13), 0.01);
    }

    @Test
    public void testStandardPlanWithExtraUsage() {

        DataBillingSystem system = new DataBillingSystem();

        assertEquals(574, system.calculateBill("standard", 30), 0.01);
    }

    @Test
    public void testPremiumPlanWithinLimit() {

        DataBillingSystem system = new DataBillingSystem();

        assertEquals(799, system.calculateBill("premium", 40), 0.01);
    }
}