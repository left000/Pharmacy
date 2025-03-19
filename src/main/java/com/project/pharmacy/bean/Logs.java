package com.project.pharmacy.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Logs {
	
	default Logger getLogger() {
		return LoggerFactory.getLogger(this.getClass());
	}

}
