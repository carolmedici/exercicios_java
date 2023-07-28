package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date DataFabricacao;
	
	public Produto_Usado(){
		
	}

	
	public Produto_Usado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		DataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return DataFabricacao;
	}
	
	

	@Override
	public String precoEtiqueta() {
		return getNome()
				+ " (usado)"
				+ " R$"
				+ String.format("%.2f",getPreco())
				+ " (Data de fabricação: "
				+ sdf.format(DataFabricacao) 
				+ ")";
					
	}	
}
