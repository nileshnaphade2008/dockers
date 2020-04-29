package com.docker.poc.application;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import generated.CreateTransactionRequest;

public class DebitCardTransProcessor implements Processor {
	private final static Logger LOG = LoggerFactory.getLogger(DebitCardTransProcessor.class);

	public void process(Exchange exchange) throws Exception {
		LOG.info("DebitCardTransProcessor  :: process :: start ");
		String recType = null;
		CreateTransactionRequest request = exchange.getProperty("REQUEST_FOR_PROVIDER", CreateTransactionRequest.class);
		recType = request.getTransactionRequest().getTransactionType();
		LOG.info("DebitCardTransProcessor  :: process :: recType " + recType);

		Map<String, Object> sqlmap = new HashMap<String, Object>();
		sqlmap.put("recType", recType);
		sqlmap.put("transReq", exchange.getProperty("ORIGINAL_REQUEST", String.class));
		sqlmap.put("timeStamp", LocalDateTime.now());
		sqlmap.put("statusCode", "New");
		exchange.getOut().setBody(sqlmap);
		LOG.info("DebitCardTransProcessor  :: process :: end ");
	}

}
