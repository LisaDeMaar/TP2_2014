/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.tdd_assignment2.services.Impl;

import com.lisa.tdd_assignment2.model.Movies;
import com.lisa.tdd_assignment2.model.Stock;
import com.lisa.tdd_assignment2.services.AssertionService;
import static java.lang.Math.max;
import static java.lang.Math.max;

/**
 *
 * @author Lisa
 */
public class TDDServiceImpl implements AssertionService 
{

    
    @Override
    public float maxValue(float value1, float value2)
    {
        return max(value1,value2);
         
    }
    
    @Override
    public int addIntegers(int number1, int number2)
    {
        return number1 + number2;
    }
    
    
    @Override
    public Movies getMovies(String movieName, String rating)
    {
        Movies movie1 = new Movies();
        movie1.setMovieName(movieName);
        movie1.setRating(rating);
        
        return movie1;
        
    }
    
    @Override
    public boolean getStatus(int age1)
    {
        boolean status = false;
        
        if(age1 >= 21)
        {
            status = true;
        }
        
        return status;
    }
    
   @Override
   public Stock getStock(int availableStock, int incomingStock)
   {
       Stock stock1 = new Stock();
       stock1.setAvailableStock(availableStock);
       stock1.setIncomingStick(incomingStock);
       
       return stock1;
   }
   
   @Override
   public int divide(int number1, int number2)
   {
      
           return number1/number2;
       
   }
}
