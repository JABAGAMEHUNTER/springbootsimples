package com.jaba.runnerz.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class RunJsonLoader implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RunJsonLoader.class);
	private final RunRepository runRepository;

	public RunJsonLoader(RunRepository runRepository) {
		this.runRepository = runRepository;
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
