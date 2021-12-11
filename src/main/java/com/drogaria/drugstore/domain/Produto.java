package com.drogaria.drugstore.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_produto")
public class Produto {
	@Id
	private Short codigo;
	private String nome;
	private Short quantidade;
	private BigDecimal preco;
	private LocalDate dataDeValidade;
	
}
