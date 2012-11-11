/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Ischenko Aleks
 */
public class LR2ClothesBean implements java.io.Serializable {
    private Integer id;
    private Integer merchantID;
    private Double price;
    private Integer size;
    private String name;
    
    public String getName() {
        return this.name;
    }
 
    public void setName(final String name) {
        this.name = name;
    }
    public Integer getSize() {
        return this.size;
    }
 
    public void setSize(final Integer newSize) {
        this.size = newSize;
    }
    public Double getPrice() {
        return this.price;
    }
 
    public void setPrice(final Double newPrice) {
        this.price = newPrice;
    }
    public Integer getMerchantID() {
        return this.merchantID;
    }
 
    public void setMerchantID(final Integer newMerchantID) {
        this.merchantID = newMerchantID;
    }
    public Integer getID() {
        return this.id;
    }
 
    public void setID(final Integer newID) {
        this.id = newID;
    }
    
    
}
