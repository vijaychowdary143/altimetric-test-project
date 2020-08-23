package com.example.demo;
import java.util.*;

public class StockDao {
    
    public Map<Integer,Stock> save(Stock stock)
    {
        

        Map<Integer,Stock> listStock=new TreeMap<>(); // Tree map for ascending order stock
        //adding stock to inventory
        listStock.put(stock.getStockNumber(), stock);
        
        return listStock;
    }
    
     public Map<Integer,Stock> getStock()
    {
        
        Map<Integer,Stock> listStock=new TreeMap<>();// Tree map for ascending order stock
        
         // Make default inventory
        Stock stock1=new Stock();
        Stock stock2=new Stock();
        Stock stock3=new Stock();
        
        listStock.put(1, stock1);
        listStock.put(2, stock2);
        listStock.put(3, stock3);
        
        return listStock;
    }
    public Map<Integer,Stock> purchaseStock(Stock stock)
    {
        Date date= new Date();
        stock.setPurchasedDate(date); // adding purchasing date
        Map<Integer,Stock> listStock=new TreeMap<>();// Tree map for ascending order stock
        
        // Make default stocks
        Stock stock1=new Stock();
        Stock stock2=new Stock();
        Stock stock3=new Stock();
        
        listStock.put(1, stock1);
        listStock.put(2, stock2);
        listStock.put(3, stock3);
        // After purchase removing the stock from inventory
        listStock.remove(stock.getStockNumber());
        
        return listStock;
    }
    public Map<Integer,Stock> updateStock(Stock stock)
    {
        
        Map<Integer,Stock> listStock=new TreeMap<>();// Tree map for ascending order stock
        
        // Make default stocks
        Stock stock1=new Stock();
        Stock stock2=new Stock();
        Stock stock3=new Stock();
        
        listStock.put(1, stock1);
        listStock.put(2, stock2);
        listStock.put(3, stock3);
        // Update the givenstock
        listStock.put(stock.getStockNumber(), stock); // Override the existing stock with new updated one
        
        return listStock;
    }
}
