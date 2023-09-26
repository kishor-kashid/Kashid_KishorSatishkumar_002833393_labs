/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class vitalSignsHistory {
    
    private ArrayList<vitalSigns> history;
    
    public vitalSignsHistory(){
        this.history = new ArrayList<vitalSigns>();
    }

    public ArrayList<vitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<vitalSigns> history) {
        this.history = history;
    }
    
    public vitalSigns addNewVital(){
        
        vitalSigns newVital = new vitalSigns();
        history.add(newVital);
        return newVital;
    }
    
    public void deleteVitals(vitalSigns vs){
        history.remove(vs);
        
    }
    
}
