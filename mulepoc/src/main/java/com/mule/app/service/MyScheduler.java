package com.mule.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyScheduler {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyScheduler.class);

	public void processData() {
		LOGGER.info("processData...........");
	}
}
