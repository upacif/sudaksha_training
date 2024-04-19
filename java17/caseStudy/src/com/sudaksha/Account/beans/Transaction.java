package com.sudaksha.Account.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public record Transaction  (
		 LocalDateTime date,
		 int accno,
		 String partuculars,
		 char transType,
		 Double amount
		) implements Serializable {

	public LocalDateTime date() {
		return date;
	}

	public int accno() {
		return accno;
	}

	public String partuculars() {
		return partuculars;
	}

	public char transType() {
		return transType;
	}

	public Double amount() {
		return amount;
	}
	

}
