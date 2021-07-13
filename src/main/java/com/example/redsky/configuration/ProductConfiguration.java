package com.example.redsky.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties
public class ProductConfiguration {

	@Value("${product.data}")
	private String productData;

	/**
	 * @return the productData
	 */
	public String getProductData() {
		return productData;
	}

	/**
	 * @param productData the productData to set
	 */
	public void setProductData(String productData) {
		this.productData = productData;
	}
	
	 /**
     * 
     * @return
     */
    @Bean("restTemplate")
    public RestTemplate restTemplate() {

    	RestTemplate restTemplate = new RestTemplate();

    	return restTemplate;

    }
	
}
