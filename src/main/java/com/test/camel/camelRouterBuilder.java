package com.test.camel;

import java.util.Date;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class camelRouterBuilder extends RouteBuilder{


	@Autowired
	CamelContext context;
	
	@Override
	public void configure() throws Exception {
		//from("sql:select * from projects where id = :#${bean:myIdGenerator.nextId}")
	    //.to("mock:result");

		//from("sql:select * from STUDENT where id = :#${bean:myIdGenerator.nextId}?outputClass=com.test.camel.Student&delay=60000&dataSource=customDataSource")
		from("sql:select * from STUDENT where admissionDate = TO_DATE(:#${bean:myIdGenerator2.nextDate}, 'DD-MON-YYYY:HH24:MI:SS' )?outputClass=com.test.camel.Student&delay=30000&dataSource=customDataSource")
		.routeId("test")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				Student s = exchange.getIn().getBody(Student.class);
				System.out.println("processor called"+s);
			}
		});
	}
	
	@Bean
	MyIdGenerator myIdGenerator() {
		return new MyIdGenerator();
	}
	
	//@Bean
	MyIdGenerator2 myIdGenerator2() {
		return new MyIdGenerator2();
	}
	//MyIdGenerator.class, "bean:myIdGenerator.nextId")
	public static class MyIdGenerator {

	    private int id = 1;

	    public int nextId() {
	    	System.out.println("id is"+id);
	        return id++;
	    }
	    
	    public String nextDate() {
System.out.println("ID:"+id);
	    	if(id==1) {
	    		id++;
	    		return "1-DEC-2021";
	    	}
	    	if(id==2)
	    	{
	    		id++;
	    		return "2-DEC-2021";
	    	}
		        
	    	if(id==3) {
	    		id++;
	    		return "3-DEC-2021";
	    	}
	    	else 
	    		return "4-DEC-2021";
	    }
	}

}
