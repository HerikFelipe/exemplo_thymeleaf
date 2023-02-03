package br.edu.unoesc.exemplo_thymeleaf;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
	public Produto(String string, int i, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
	}
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
}