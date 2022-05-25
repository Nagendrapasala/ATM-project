package Atm;
import java.util.*;
import java.io.IOException;
import java.text.*;

public class Accounts {

	private int customer_number;
	private int pin_number;
	private double current_amount = 0;
	private double savings_amount = 0;
	DecimalFormat db = new DecimalFormat("'$'###,##0.00");
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public int getPin_number() {
		return pin_number;
	}
	public void setPin_number(int pin_number) {
		this.pin_number = pin_number;
	}
	public double getCurrent_amount() {
		return current_amount;
	}
	public void setCurrent_amount(double current_amount) {
		this.current_amount = current_amount;
	}
	public double getSavings_amount() {
		return savings_amount;
	}
	public void setSavings_amount(double savings_amount) {
		this.savings_amount = savings_amount;
	}
	
	public void currentwithdrowalbalance(double amount)
	{
		current_amount-=amount;
	}
	public void savingswithdrowalbalance(double amount)
	{
		savings_amount-=amount;
	}
	public void currentdepositebalance(double amount)
	{
		current_amount+=amount;
	}
	public void savingsdepositebalance(double amount)
	{
		savings_amount+=amount;
	}
	
	public void calc_currentwithdrowalbalance() 
	{
		System.out.println("Enter amount to be withdrowed ");
		Scanner a = new Scanner(System.in);
		double amount = a.nextDouble();
		if((current_amount-amount)>0)
		{
			currentwithdrowalbalance(amount);
			System.out.println("Thanks for the wirthdrawal .");
			System.out.println("");
			System.out.println(" your current account balance is : "+ db.format(current_amount));
		}else
		{
			System.out.println("your account balance can't be negetive please deposite sufficient amount before wirthdrawal");
			
		}
	}
	public void calc_savingswithdrowalbalance() 
	{
		System.out.println("Enter amount to be withdrowed ");
		Scanner a = new Scanner(System.in);
		double amount = a.nextDouble();
		if((savings_amount-amount)>0)
		{
			savingswithdrowalbalance(amount);
			System.out.println("Thanks for the wirthdrawal." );
			System.out.println("");
			System.out.println("your savings account balance is : "+ db.format(savings_amount));
		}else
		{System.out.println("your account balance can't be negetive please deposite sufficient amount before wirthdrawal");
			
		}
	}
	public void clac_currentdepositebalance() 
	{
		System.out.println("Enter amount to be deposited ");
		Scanner a = new Scanner(System.in);
		double amount = a.nextDouble();
		if(amount>0)
		{
			currentdepositebalance(amount);
			System.out.println("Thank-you for depositing the amount , please do visit again! " );
			System.out.println("");
			 System.out.println("your current account balance is: "+db.format(current_amount));
		}else
		{
			System.out.println("Sorry you can't enter negetive nembers, please try again");
		}
		
	}
	public void clac_savingsdepositebalance() 
	{
		System.out.println("Enter amount to be deposited ");
		Scanner a = new Scanner(System.in);
		double amount = a.nextDouble();
		if(amount>0)
		{
			savingsdepositebalance(amount);
			System.out.println("Thank-you for depositing the amount , please do visit again! ");
			System.out.println("");
			System.out.println("your savings account balance is: "+db.format(savings_amount));
		}else
		{
			System.out.println("Sorry you can't enter negetive nembers, please try again");
		}
		
	}
}
