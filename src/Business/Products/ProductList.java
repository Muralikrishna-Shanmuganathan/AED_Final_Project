/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.ArrayList;

/**
 *
 * @author ANIRUDH
 */
public class ProductList {
    ArrayList<Product> productList;

    public ProductList() {
        productList=new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public void addProducttoList(Product product)
    {
        productList.add(product);
    }
            
    
    public void removeProductfromList(Product product){
        productList.remove(product);
    }
            
    
    
   
}
