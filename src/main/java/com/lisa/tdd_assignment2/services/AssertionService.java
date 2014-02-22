/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.tdd_assignment2.services;

import com.lisa.tdd_assignment2.model.Movies;
import com.lisa.tdd_assignment2.model.Stock;

/**
 *
 * @author Lisa
 */
public interface AssertionService 
{
    float maxValue(float value1, float value2);
    int addIntegers(int number1, int number2);
    public Movies getMovies(String movieName, String rating);
    boolean getStatus(int age1);
    public Stock getStock(int availableStock, int incomingStock);
    int divide(int number1, int number2);
}
