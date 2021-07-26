package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	private Map<Strin,Object> cache= new HashMap<String,Object>();	

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//changes for HIS-134
int a=98;
		System.out.println(context);
		context.close();
	}

	//HIS-301 changes
	public void loadDataToCache(){
}

}
