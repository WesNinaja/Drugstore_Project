package com.drogaria.drugstore.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {

	//Vou criar um método para testar a criação.
	@Test
	public void criar () {
		Produto p = new Produto(
				Short.valueOf("1"), 
				"Coca-Cola", 
				Short.valueOf("15"), 
				BigDecimal.valueOf(10.50), 
				LocalDate.of(2022, 11, 28)
				);
		System.out.println(p);
	}
	
	
}
