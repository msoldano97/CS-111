/********************************************
* AUTHOR: German Gomez
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  Final_Project
*****************************************************************************
* PROGRAM DESCRIPTION:
* The capstone team project (2–3 students per team) for this class involves 
* conceptualizing, designing, and developing a Java application for either 
* non-profit or commercial motivations.  The application should meet the set 
* of functional and non-functional requirements described below.  Teams will 
* follow a managed development process that results in well-designed, 
* well-documented software, as outlined below.
*****************************************************************************
* ALGORITHM:
* 1. Make a simple class with a constructor, getters, setters, equals, and
* toString for a burrito
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Burritos extends TacoStand {
	
	private String mMeat, mBeans, mRice, mSauce, mCheese;
	
	
	public Burritos (double price, String name, String meat, String cheese, 
					 String beans, String rice, String sauce){
		super(price, name);
		mMeat = meat;
		mBeans = beans;
		mRice = rice;
		mSauce = sauce;
		mCheese = cheese;
		}
		
	
	public String getMeat(){
		return mMeat;
	}
	
	public String getBeans(){
		return mBeans;
	}
	
	public String getRice(){
		return mRice;
	}
	
	public String getSauce(){
		return mSauce;
	}
	
	public String getCheese(){
		return mCheese;
	}
	
	public void setMeat(String newMeat){
		mMeat = newMeat;
	}
	
	public void setBeans(String newBeans){
		mBeans = newBeans;
	}
	
	public void setRice(String newRice){
		mRice = newRice;
	}
	
	public void setSauce(String newSauce){
		mSauce = newSauce;
	}
	
	public void setCheese(String newCheese){
		mCheese = newCheese;
	}
	
	public String toString(){
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "A " + mMeat + " burrito with " + mBeans + " beans, " +
						((mCheese.equalsIgnoreCase("Yes")) ? "cheese, " : "no cheese, ") +
						 mSauce + " sauce, " + mRice + " rice.\t Price: " + currency.format(mPrice);
		return output;
	}

}
