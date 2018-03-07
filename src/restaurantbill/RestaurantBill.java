/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantbill;

import java.text.DecimalFormat;
/**
 *
 * @author huangsiwen
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cost=8.95,taxes,total;
        taxes=cost*0.13;
        total=taxes+cost;
        
        System.out.println("Restaurant Bill"+'\n'+"***************"+'\n'+'\n'+"Meal:"+'\t'+"$"+cost);
        DecimalFormat x = new DecimalFormat("$#.##");
        DecimalFormat y = new DecimalFormat("$##.##");
        
        System.out.println("HST:"+'\t'+x.format(taxes));
        System.out.println("Total:"+'\t'+y.format(total));
    }
    
}
