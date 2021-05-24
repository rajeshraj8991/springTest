package com.rajesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class MyTestRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {

		StopWatch st = new StopWatch("my runner data");
		st.start("my loop#1");
		//st.start();
		System.out.println("Hello");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(i + 1, i * i * i);

		}
		st.stop();
		
		st.start("my loop#2");
		System.out.println("Hi");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(i + 1, i * i * i);    
		}
		st.stop();
		
		st.start("my loop#3");

		System.out.println("Bye");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow(i + 1, i * i * i);
		}
		st.stop();
		System.out.println(st.prettyPrint());
		//st.stop();
		/*
		 * System.out.println("Sec=>"+st.getTotalTimeSeconds());
		 * System.out.println("Milli Sec=> "+st.getTotalTimeMillis());
		 * System.out.println("Nano Sec=>"+st.getTotalTimeNanos());
		 */
	}

}
