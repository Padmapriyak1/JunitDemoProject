package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BMICalculatorTest {



@Test
public void isDietRecommendedTest()
{
	
 //Given
	
	double weight = 90;
	double height = 1.2;
	

 //When
	
	boolean DietRecommended = BMICalculator.isDietRecommended(weight, height);
 
 //Then
 
 assertFalse (DietRecommended);
}
}
