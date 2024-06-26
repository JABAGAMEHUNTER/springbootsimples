package com.jaba.runnerz.run;

import java.lang.StackWalker.Option;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {

	private static final Logger log = LoggerFactory.getLogger(RunRepository.class);

	private final JdbcClient jdbcClient;


	public RunRepository(JdbcClient jdbcClient){
		this.jdbcClient = jdbcClient; 
 	}
	public List<Run> findAll() {
		return jdbcClient.sql("select * from run")
													.query(Run.class)
													.list();
	}

}
