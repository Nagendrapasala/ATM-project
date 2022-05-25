package Atm;
import java.io.IOException;
import java.text.*;
import java.util.*;

public class OptionMenu extends Accounts {

	DecimalFormat db = new DecimalFormat("'$'###,##0.00");
	Accounts acc = new Accounts();
	HashMap<Integer,Integer> lg = new HashMap<Integer,Integer>(); 
	public void login() throws IOException 
	{
		int f = 1;
		do
		{
			try {
			
			lg.put(123432,134213);
			lg.put(9878490,9876233);
			System.out.println("Enter the Account number");
			Scanner sc = new Scanner(System.in);
			acc.setCustomer_number(sc.nextInt());
			System.out.println("Enter your persional pin number");
			acc.setPin_number(sc.nextInt());
			}catch(IndexOutOfBoundsException e)
			{
				System.out.println("enter valid numbers please "+ e.getMessage());
				f=2;
			}finally
			{
				account_Type();
			}
			
		}while(f<1);
	}
	
	public void account_Type() throws IOException
	{
		System.out.println("");
		System.out.println("Hi there..! Welcome, select the options given below ");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option 1 for current_account ");
		System.out.println("Select option 2 for savings_account" );
		System.out.println("select option 3 to exit the menu");
		switch(sc.nextInt())
		{
		case 1:System.out.println(" your current account balance is : "+ db.format(acc.getCurrent_amount())); current_accounttype();
		break;
		case 2: System.out.println("your savings account balance is : "+ db.format(acc.getSavings_amount()));savings_accounttype();
		break;
		case 3: System.out.println("thank-you for visiting us, have a good day");account_Type();
		break;
		default:System.out.println("please select valid option, try again!"); account_Type();
		}
	}

	public void current_accounttype() throws IOException
	{
//		System.out.println("");
//		System.out.println("Hello there..! Welcome, select the options given below ");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option 1 to Deposit amount in your current_account");
		System.out.println("Select option 2 to withdraw amount from your current_account" );
		System.out.println("select option 3 to exit to the menu");
		switch(sc.nextInt())
		{
		case 1 : acc.clac_currentdepositebalance();current_accounttype();
		break;
		case 2 : acc.calc_currentwithdrowalbalance();current_accounttype();
		break;
		case 3: System.out.println("thanks for visiting us, have a good day!");account_Type();
		break;
		default:  System.out.println("please select valid option"); current_accounttype();
		}
	}
	public void savings_accounttype() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("");
		//System.out.println("Hello there..! Welcome, select the options given below ");
		System.out.println("");
		System.out.println("Select option 1 to Deposit amount in to your savings_account ");
		System.out.println("Select option 2 to withdraw amount from your savings account" );
		System.out.println("select option 3 to exit to the menu");
		switch(sc.nextInt())
		{
		case 1 : acc.clac_savingsdepositebalance();savings_accounttype();
		break;
		case 2 : acc.calc_savingswithdrowalbalance();savings_accounttype();
		break;
		case 3: System.out.println("thanks for visiting us, have a good day!");account_Type();
		break;
		default:  System.out.println("please select valid option"); savings_accounttype();
		}
	}
	
}