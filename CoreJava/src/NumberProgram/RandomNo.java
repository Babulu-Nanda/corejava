package NumberProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class RandomNo {
	

	// and finally, when your program wants to exit

	public static void main(String[] abc) {
		random();
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		System.out.println(generateUniqueId());
		System.out.println(generateStan());
		executor.shutdown();
	}

	 public static Long generateUniqueId() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YMMddHHmmssSSS");
	        return Long.valueOf(LocalDateTime.now().format(formatter));
	    }
	 public static int generateStan() {
	        AtomicInteger atomicInteger = new AtomicInteger(100000);
	        int stan = atomicInteger.incrementAndGet();
	        System.out.println("stan= " + stan);
	        if (stan == 999999) {
	            System.out.println(stan + " Reseting stan to 100000");
	            atomicInteger.set(100000);
	        }
	        return stan;
	    }
	
	private static void random() 
	{
		AtomicLong sequenceNumber = new AtomicLong(000000000001L);
		  long code = sequenceNumber.getAndIncrement();
		    if (code == 999999999999L) {
		        sequenceNumber = new AtomicLong(000000000001L);
		        code = sequenceNumber.getAndIncrement();
		    }
		    System.out.println("//*****Next Sequence Number*****// Code" + code);
		    
	}
}
