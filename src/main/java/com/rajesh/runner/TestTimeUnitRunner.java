package com.rajesh.runner;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestTimeUnitRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//hrs to mins
		TimeUnit tu;
		long l= TimeUnit.HOURS.toMinutes(3);
		System.out.println(l);
		//mint to mili sec
		long l2= TimeUnit.MINUTES.toMillis(50);
		System.out.println(l2);
		//days to sec
		long l3= TimeUnit.DAYS.toSeconds(1);
		System.out.println(l3);
		
	
		System.out.println(TimeUnit.SECONDS.toNanos(12));
		System.out.println(TimeUnit.NANOSECONDS.toMicros(1000000000));
		
		System.out.println("Current Time :"+System.currentTimeMillis());
		System.out.println(TimeUnit.MICROSECONDS.toNanos(System.currentTimeMillis()));
		System.out.println(TimeUnit.HOURS.toDays(48));
		
	}

}
