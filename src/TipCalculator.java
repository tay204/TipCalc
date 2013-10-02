import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Tip Calculator
 * Author: Thomas Yeo
 * 2013
 */
public class TipCalculator 
{
	public static final double Tax_Rate = .045; //set the tax rate
	
	public static void main(String[] args) 
	{
		DecimalFormat two = new DecimalFormat("##.00");  
		// this will helps you to always keeps in two decimal places
		
		// Step 1: Get the total bill
		String billInput = JOptionPane.showInputDialog("Enter the total bill");
		double totalBill;
		totalBill = Double.parseDouble(billInput);
		
		double taxAmount = totalBill * Tax_Rate;
		double billWithTax = totalBill + taxAmount;
		JOptionPane.showMessageDialog(null,"The bill plus tax is " + "$" + two.format(billWithTax)); 
	    
		// Step 2: Get the tips percentage
	    String tipInput = JOptionPane.showInputDialog("Enter the tip %");
	    double tipPercent = Double.parseDouble(tipInput);
	    
		// Step 3: Calculate the tips -> tips = totalBill * percentage
	    double tipAmount = (totalBill * (tipPercent / 100));
	    JOptionPane.showMessageDialog(null, "The amount to tip is " + "$" + two.format(tipAmount));
	    
		// Step 4: Display the grand total including tips and tax
		JOptionPane.showMessageDialog(null, "The total bill, including tax and tip is " 
				+ "$" + two.format(billWithTax + tipAmount));
		
		System.exit(0);
		
	}

}
