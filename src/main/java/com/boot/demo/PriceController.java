package com.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PriceController.class);
	
	@RequestMapping("/getPrice")
	public @ResponseBody PriceData getProductPrice(@RequestBody String productCode)
	{
		LOG.info("inside getProductPrice...");
		
		LOG.info("Fetching Price for "+productCode);
		
		PriceData data = new PriceData();
		data.setUnitPrice(1800.00);
		data.setUom("ltr");
		
		return data;
	}

}
