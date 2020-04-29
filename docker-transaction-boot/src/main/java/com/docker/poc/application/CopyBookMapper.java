package com.docker.poc.application;

import com.debit.copybook.trans.DebitClient;
import com.debit.copybook.trans.DebitClientTrans;
import com.debit.copybook.trans.Order;

import generated.CreateTransactionRequest;

public class CopyBookMapper {

	public DebitClientTrans convert(CreateTransactionRequest request) throws Exception {

		DebitClientTrans debit = new DebitClientTrans();
		DebitClient client = new DebitClient();
		Order order = new Order();
		client.setTransactionKey(request.getMerchantAuthentication().getTransactionKey());
		client.setTransactionType(request.getTransactionRequest().getTransactionType());
		client.setRoutingNumber(String.valueOf(request.getTransactionRequest().getPayment().getBankAccount().getRoutingNumber()));
		client.setAccountNumber(String.valueOf(request.getTransactionRequest().getPayment().getBankAccount().getAccountNumber()));
		client.setAccountType(request.getTransactionRequest().getPayment().getBankAccount().getAccountType());
		client.setFirstname(request.getTransactionRequest().getBillTo().getFirstName());
		client.setLastName(request.getTransactionRequest().getBillTo().getLastName());
		client.setNameOnAccount(request.getTransactionRequest().getPayment().getBankAccount().getNameOnAccount());
		debit.setDebitClient(client);
		order.setDescription(request.getTransactionRequest().getOrder().getDescription());
		order.setInvoiceNumber(request.getTransactionRequest().getOrder().getInvoiceNumber());
		debit.setOrder(order);
 		return debit;

	}

}
