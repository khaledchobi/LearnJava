package batch.covid.day3;

import javax.swing.JOptionPane;

public class CircuitBoardProfit {

    public static void main(String args[]) {
        final double profit_percentage = 0.4;
        double user_retail_price;
        double company_profit;

        String userOutputString = JOptionPane.showInputDialog( "Please enter the retail price of the product" );
        user_retail_price = Double.parseDouble( userOutputString );

        company_profit = profit_percentage * user_retail_price;

        JOptionPane.showMessageDialog( null, "The profit earned on $" + user_retail_price + " is $" + company_profit);
        System.exit( 0 );


    }


}
