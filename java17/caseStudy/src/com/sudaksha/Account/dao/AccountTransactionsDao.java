package com.sudaksha.Account.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.sudaksha.Account.beans.Account;
import com.sudaksha.Account.beans.Transaction;

public class AccountTransactionsDao {

	@SuppressWarnings("unchecked")
	public List<Account> readAllAccounts() {
		List<Account> availableAccounts = null;
		try (FileInputStream fis = new FileInputStream("C:\\PA\\sudaksha\\files\\bank_system\\bankAccountsList");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object obj;
			while ((obj = ois.readObject()) != null) {
				availableAccounts = (List<Account>) obj;
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		return availableAccounts;
	}

	public void writeAllAccounts(List<Account> allAccounts) {
		try (FileOutputStream fos = new FileOutputStream("C:\\PA\\sudaksha\\files\\bank_system\\bankAccountsList");
				ObjectOutputStream ois = new ObjectOutputStream(fos);) {
			ois.writeObject(allAccounts);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeToTransactionRecord(List<Transaction> transactions) {
		try (FileOutputStream fos = new FileOutputStream("C:\\PA\\sudaksha\\files\\bank_system\\transactions");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(transactions);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Transaction> readAllTransactions() {
		List<Transaction> transactions = null;
		try (FileInputStream fis = new FileInputStream("C:\\PA\\sudaksha\\files\\bank_system\\transactions");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object obj;
			while ((obj = ois.readObject()) != null) {
				transactions = (List<Transaction>) obj;
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		return transactions;
	}

}
