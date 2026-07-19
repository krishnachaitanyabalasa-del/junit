package com.testing.junit;

import Calc.Calc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitApplication {

	public static void main(String[] args) {

		SpringApplication.run(JunitApplication.class, args);

		Calc c = new Calc();
		int res = c.divide(10,2);
		if(res == 5){
			System.out.println("Passed");

		}else{
			System.out.println("Failed");
		}
	}

}
