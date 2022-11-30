package br.com.alura.loja;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

	@Test
	public void testGetNomeProduto() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		Assert.assertEquals("teste", p.getNome());
	}

	@Test
	public void testGetPrecoProduto() {
		Produto p = new Produto("teste", BigDecimal.TEN);
		Assert.assertEquals(BigDecimal.TEN, p.getPreco());
	}

}
