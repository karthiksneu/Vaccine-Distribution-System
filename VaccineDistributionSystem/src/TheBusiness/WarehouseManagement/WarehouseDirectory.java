/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.WarehouseManagement;

import java.util.ArrayList;

/**
 *
 * @author soham
 */

//Creating class WarehouseDirectory
public class WarehouseDirectory {
    
    private ArrayList<Warehouse> warehouseList;

    public WarehouseDirectory() {
        warehouseList = new ArrayList<>();
    }

    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }
    
    public Warehouse addNewWareHouse(){
        
        Warehouse wh = new Warehouse();
        warehouseList.add(wh);
        return wh;
    }
    
    
    public void removeWarehouse(Warehouse wh){
        
        warehouseList.remove(wh);
    }
}
