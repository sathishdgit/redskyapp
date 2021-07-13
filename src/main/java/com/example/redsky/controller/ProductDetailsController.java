/**
 * 
 */
package com.example.redsky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redsky.configuration.ProductConfiguration;

/**
 * @author ctsuser
 *
 */
@RestController
public class ProductDetailsController {
	
	@Autowired
	ProductConfiguration productConfig;

	@GetMapping("/proddetails")
	private String getProductDetails() {
		
		return productConfig.getProductData();
	}
}
