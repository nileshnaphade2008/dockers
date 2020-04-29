package com.docker.poc.application;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailProcessor implements Processor {
	private final static Logger LOG = LoggerFactory.getLogger(EmailProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		LOG.info("EmailProcessor  :: process :: start ");
		Map<String, Object> mailHeaders = new HashMap<String, Object>();
		mailHeaders.put("Subject",
				exchange.getProperty("SUBJECT") != null ? exchange.getProperty("SUBJECT", String.class)
						: "Transaction has been accepted for processing...!");
		exchange.getIn().setHeaders(mailHeaders);
		LOG.info("EmailProcessor  :: process :: end ");

	}

	public void setSubject(Exchange exchange) throws Exception {

		exchange.setProperty("SUBJECT", "Trnsaction successfully received ::");
	}
}
