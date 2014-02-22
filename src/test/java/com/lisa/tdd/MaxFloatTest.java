/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.tdd;

import com.lisa.tdd_assignment2.app.conf.AppConfig;
import com.lisa.tdd_assignment2.services.AssertionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */
public class MaxFloatTest {
    
    private AssertionService assertionService;
    
    public MaxFloatTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public void setUpClass() throws Exception 
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        assertionService = (AssertionService)ctx.getBean("tddImp");

    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testMaxFloat() throws Exception
    {
       float maxResult = assertionService.maxValue(5,8);
       
       Assert.assertEquals(maxResult, 8, 2, "The maximum between two floats");
    }
    
   
    
}
