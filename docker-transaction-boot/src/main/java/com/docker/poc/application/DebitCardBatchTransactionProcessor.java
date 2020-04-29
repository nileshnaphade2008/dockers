package com.docker.poc.application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitCardBatchTransactionProcessor implements Processor {
	private final static Logger LOG =LoggerFactory.getLogger(DebitCardBatchTransactionProcessor.class);
	public void process(Exchange exchange) throws Exception {
		LOG.info("DebitCardBatchTransactionProcessor  :: process : start");
		@SuppressWarnings("unchecked")
		List<Map<String, String>> map = exchange.getIn().getBody(List.class);

		List<String> listOfrecords = new ArrayList<String>();
		List<String> listOfrecordsId = new ArrayList<String>();

		for (Map<String, String> mp : map) {
			listOfrecords.add(mp.get("REQ_DATA"));
			listOfrecordsId.add(mp.get("REQ_ID"));
		}
		exchange.setProperty("RECORDS_IDS", listOfrecordsId);
		exchange.getIn().setBody(listOfrecords, List.class);
		LOG.info("DebitCardBatchTransactionProcessor  :: process : end");
	}
	public void setRecordId(Exchange exchange) {
		@SuppressWarnings("unchecked")
		List<String> listOfrecordsId = exchange.getProperty("RECORDS_IDS", List.class);
		Map<String, Object> sqlmap = new HashMap<String, Object>();
		sqlmap.put("recordId", listOfrecordsId.get(exchange.getProperty("CamelSplitIndex", Integer.class)));
		sqlmap.put("statusCode", "done");
		sqlmap.put("createTimeStamp", exchange.getProperty("BATCH_START_TIME"));
		LOG.info("RecordId : "+sqlmap.get("recordId"));
		exchange.setProperty("RECORD_ID", sqlmap.get("recordId"));
		exchange.getIn().setBody(sqlmap);
	}
	public void setDebitBatchStartTime(Exchange exchange) {
		exchange.setProperty("BATCH_START_TIME", LocalDateTime.now());
	}
	public void isDebitBatchContinue(Exchange exchange) {
		if(exchange.getProperty("RECORDS_IDS", List.class).isEmpty())
		{
		 LOG.info(" DebitBatch is completed#########");
		  exchange.setProperty("IS_BATCH_CONTINUE", "false");
		}else {
			LOG.info("DebitBatch is continued#############");
		}
	 }
}
	
	
	
