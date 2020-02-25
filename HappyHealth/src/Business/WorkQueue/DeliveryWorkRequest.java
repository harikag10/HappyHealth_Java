/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Harika
 */
public class DeliveryWorkRequest extends WorkRequest{
    private int drugQuantity;
    private String drugName;
    private String destinationNetwork;

    public int getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(int drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDestinationNetwork() {
        return destinationNetwork;
    }

    public void setDestinationNetwork(String destinationNetwork) {
        this.destinationNetwork = destinationNetwork;
    }
    
    @Override
    public String toString() {
        return drugName;
    }
}
