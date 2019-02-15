/*    Course: CIS611
 *  Semester: Spring 2019
 *      Name: Ernie Baier
 *Assignment: PA03
 *  Class Description: Calculate the total charge for ski rental taking into account multiple variables    
 *  Saved as: SkiRentalCalculation.java                               
 *  Last Modified: 02/15/2019
 */

import javax.swing.JOptionPane;

public class SkiRentalCalculation {

	public static void main(String[] args) {
		
		//Declare constants
		double SALES_TAX_PERCENTAGE = 7.5;
		
		/* Code block for gathering inputs from the user on number of skiers 
		 * and creating arrays to store those skiers information */
		 
		String numOfSkiCustomers =JOptionPane.showInputDialog("Please enter the number of ski customers as a whole number.");
				int numOfCustomers = Integer.parseInt(numOfSkiCustomers);
				String[] namesArr = new String[numOfCustomers];
				double[] valuesArr = new double[numOfCustomers];
		
		/*Code block for gathering info on each skiers number of
		 * rental items, days,discounts, etc. to calculate the charge. */
				
		for (int i = 1; i<=numOfCustomers; i++) {
				
			String customerName = JOptionPane.showInputDialog("Please enter the first and last name of skier "+i);
			namesArr[i] = customerName;
			int numOfDays = Integer.parseInt(JOptionPane.showInputDialog("How many days will the rental be for?"));
			int numOfItems = Integer.parseInt(JOptionPane.showInputDialog("How many items will be rented? Up to 3 items are available for rent."));
			Boolean firstTime = false;
			if(JOptionPane.showInputDialog("Is skier "+i+" a first time skier? Enter Yes or No.") == "Yes")
				{firstTime = true;}
			Boolean haveDiscount = false;
			if(JOptionPane.showInputDialog("Does skier "+i+" have a discount coupon? Enter Yes or No.") == "Yes")
				{haveDiscount = true;}
			Boolean haveMembership = false;
			if(JOptionPane.showInputDialog("Does skier "+i+" have a membership? Enter Yes or No.") == "Yes")
				{haveMembership = true;}
	
			/*Code block for calculating the total charge of a skiers rental 
			 *based on the inputs they provided and the pricing scheme presented in the homework */
			
			double totalCharge = 0;
			
			switch(numOfItems) {
				case 0: totalCharge = (60*numOfDays);
						if(firstTime) {totalCharge = totalCharge - (totalCharge * 0.1);}
						if(haveMembership) {totalCharge = totalCharge - (totalCharge * 0.05);}
						if(haveDiscount) {totalCharge = totalCharge - 5;}
						totalCharge = totalCharge - (totalCharge * SALES_TAX_PERCENTAGE);
						valuesArr[i] = totalCharge;
						break;
				case 1: totalCharge = (110*numOfDays);
						if(firstTime) {totalCharge = totalCharge - (totalCharge * 0.12);}
						if(haveMembership) {totalCharge = totalCharge - (totalCharge * 0.08);}
						if(haveDiscount) {totalCharge = totalCharge - 10;}
						totalCharge = totalCharge - (totalCharge * SALES_TAX_PERCENTAGE);
						valuesArr[i] = totalCharge;
						break;
				case 2: totalCharge = (115*numOfDays);
						if(firstTime) {totalCharge = totalCharge - (totalCharge * 0.12);}
						if(haveMembership) {totalCharge = totalCharge - (totalCharge * 0.08);}
						if(haveDiscount) {totalCharge = totalCharge - 10;}
						totalCharge = totalCharge - (totalCharge * SALES_TAX_PERCENTAGE);
						valuesArr[i] = totalCharge;
						break;
				case 3: totalCharge = (190*numOfDays);
						if(firstTime) {totalCharge = totalCharge - (totalCharge * 0.12);}
						if(haveMembership) {totalCharge = totalCharge - (totalCharge * 0.08);}
						if(haveDiscount) {totalCharge = totalCharge - 10;}
						totalCharge = totalCharge - (totalCharge * SALES_TAX_PERCENTAGE);
						valuesArr[i] = totalCharge;
						break;
			}
			 
			JOptionPane.showMessageDialog(null, valuesArr);
	}

		
}}
