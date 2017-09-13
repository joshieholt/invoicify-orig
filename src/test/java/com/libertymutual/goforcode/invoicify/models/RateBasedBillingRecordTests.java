package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class RateBasedBillingRecordTests {

    @Test
    public void checking_to_make_sure_my_getters_and_setters_work() {
        BeanTester tester = new BeanTester();
        Configuration configuration = new ConfigurationBuilder()
                 .ignoreProperty("createdOn")
                .build();
        tester.testBean(RateBasedBillingRecord.class, configuration);

    }
    
    @Test
    public void check_that_getTotal_returns_the_total_amount() {
        //Arrange
        RateBasedBillingRecord record = new RateBasedBillingRecord();
        record.setRate(10);
        record.setQuantity(40);
        
        //Act
        double amount = record.getTotal();
        
        //Assert
        assertThat(amount).isEqualTo(400);
    }
    

}