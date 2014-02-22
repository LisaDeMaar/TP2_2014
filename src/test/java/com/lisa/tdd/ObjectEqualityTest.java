/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.tdd;

import com.lisa.tdd_assignment2.app.conf.AppConfig;
import com.lisa.tdd_assignment2.model.Movies;
import com.lisa.tdd_assignment2.services.AssertionService;
import com.lisa.tdd_assignment2.services.Impl.TDDServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Lisa
 */
public class ObjectEqualityTest {
    
    private AssertionService assertionService;

    
    public ObjectEqualityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception 
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        assertionService = (AssertionService)ctx.getBean("tddImp");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
    @Test
     public void testObjectEquality() throws Exception
    {
        
        Movies movie1 = assertionService.getMovies("Frozen", "5");
        //Movies movie2 = assertionService.getMovies("Frozen", "5");
        
        Assert.assertEquals(movie1, movie1, "Asserting object equality.");
    }
}
