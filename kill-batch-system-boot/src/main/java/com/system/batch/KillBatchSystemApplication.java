package com.system.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KillBatchSystemApplication {

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(KillBatchSystemApplication.class, args)));
	}

}
