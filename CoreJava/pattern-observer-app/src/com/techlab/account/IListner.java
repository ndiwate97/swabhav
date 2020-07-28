package com.techlab.account;

import java.util.Date;

public interface IListner {

	public void update(String transaction, int amount, int accountNo, Date date);

}
