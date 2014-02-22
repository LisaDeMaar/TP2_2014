/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.tdd_assignment2.app.conf;

import com.lisa.tdd_assignment2.services.AssertionService;
import com.lisa.tdd_assignment2.services.Impl.TDDServiceImpl;
import org.springframework.context.annotation.Bean;



/**
 *
 * @author Lisa
 */
public class AppConfig 
{
    @Bean(name="tddImp")
    public AssertionService getTDDService()
    {
        return new TDDServiceImpl();
        
    }
    
   

}
