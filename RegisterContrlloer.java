package com.example.demo;
import java.util.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StockController {


	@RequestMapping(value = "createStock", method = RequestMethod.POST)
	public String createStock(Model model, Stock stock) {

		StockDao stockDao=new StockDao();
		Map<Integer,Stock> listStock=stockDao.save(stock);	
		model.addAttribute("listStock", listStock);
		
		return "listStockPage"; //Stock inventory page
		
		
	}

	@RequestMapping(value = "getStock", method = RequestMethod.POST)
	public String getStock(Model model) {

		StockDao stockDao = new StockDao();
		Map<Integer,Stock> listStock=stockDao.getStock();	
		model.addAttribute("listStock", listStock);
		return "listStockPage"; //Stock inventory page
		
	}

	@RequestMapping(value = "updateStock", method = RequestMethod.POST)
	public String update(Stock stock, Model model) {

		StockDao stockDao=new StockDao();
        Map<Integer,Stock> listStock=stockDao.updateStock(stock);
        model.addAttribute("listStock", listStock);
		return "listStock";  //Stock inventory page
		
	}
	@RequestMapping(value = "purchaseProduct", method = RequestMethod.POST)
	public String purchaseProduct(Stock stock, Model model) {

		StockDao stockDao=new StockDao();
		Map<Integer,Stock> listStock=stockDao.purchaseStock(stock);
		model.addAttribute("listStock", listStock);
		return "listStock";  //Stock inventory page
		
		
	}


}
