package com.boot.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	
	@RequestMapping("/getPrice")
	public @ResponseBody PriceData getProductPrice(@RequestBody String productCode)
	{
		System.out.println("Fetching Price for "+productCode);
		
		PriceData data = new PriceData();
		data.setUnitPrice(1800.00);
		data.setUom("ltr");
		
		return data;
	}

}
