package com.cyient.utilies;

import org.testng.annotations.DataProvider;

public class DataProviderutils
{

	@DataProvider
    public Object[][] validcredentialData()
    {
    	Object[][] main=new Object[2][2];
    	
    	main[0][0]="Priyanka.idhate.1@gmail.com";
    	main[0][1]="pri123";
    	
    	main[1][0]="priyankaidhate@gmail.com";
    	main[1][1]="abcd123";
    	
    	return main;
    }
	
	
	@DataProvider
    public Object[][] invalidcredentialData()
    {
    	Object[][] main=new Object[2][3];
    	
    	main[0][0]="john123";
    	main[0][1]="pri123";
    	main[0][2]="Please enter a valid email address";
    	
    	main[1][0]="pri123";
    	main[1][1]="abcd123";
    	main[1][2]="Please enter a valid email address";
    	
    	return main;
    }
}
