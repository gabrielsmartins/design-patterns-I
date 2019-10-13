package br.edu.patterns.domain.nf.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.edu.patterns.domain.nf.ItemNota;
import br.edu.patterns.domain.nf.NotaFiscal;
import br.edu.patterns.domain.nf.builder.NotaFiscalBuilder;

public class NotaFiscalBuilderTest {

	@Test
	public void deveCriarNotaFiscal() {
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
									    .paraEmpresa("razao social")
									    .comCnpj("cnpj")
									    .naDataAtual()
									    .comItem(new ItemNota("item 1", 200.00))
									    .comItem(new ItemNota("item 2", 300.00))
									    .comObservacoes("obsercoes");
		
		NotaFiscal nf  = builder.build();
		
		assertNotNull(nf);
	}
}
