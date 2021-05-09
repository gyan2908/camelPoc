package com.test.camel;

import org.springframework.stereotype.Repository;

@Repository
class MyIdGenerator2 {

	    private int id = 1;

	    public int nextId() {
	    	System.out.println("id is"+id);
	        return id++;
	    }
	    
	    public String nextDate() {

	    	if(id==1) {
	    		id++;
	    		return "1-DEC-2021:1024:12:12";
	    	}
	    	if(id==2)
	    	{
	    		id++;
	    		return "2-DEC-2021:1124:12:12";
	    	}
		        
	    	if(id==3) {
	    		id++;
	    		return "3-DEC-2021:0924:12:12";
	    	}
	    	else 
	    		return "4-DEC-2021:0924:12:12";
	    }
	}