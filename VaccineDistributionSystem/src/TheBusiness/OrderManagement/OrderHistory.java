/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.OrderManagement;

import java.util.ArrayList;

/**
 *
 * @author karthik
 */
public class OrderHistory {
    
    private ArrayList<Order> History;

    public OrderHistory() {
        History = new ArrayList<>();
        
    }

    public ArrayList<Order> getOrderHistory() {
        return History;
    }
    
    public Order addNewOrder(){
        Order order = new Order();
        History.add(order);
        return order;
    }
    
    public Order addOrder(Order order){
        
       
        History.add(order);
        return order;
    }
    
    
    public void removeOrder(Order order){
        History.remove(order);
        
    }
    
}
