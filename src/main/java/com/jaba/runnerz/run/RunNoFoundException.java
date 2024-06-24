package com.jaba.runnerz.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RunNoFoundException extends RuntimeException {
	public RunNoFoundException() {
		super("Run Not Found");
	}
}
