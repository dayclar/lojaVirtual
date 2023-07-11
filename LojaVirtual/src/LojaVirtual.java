
public class LojaVirtual {
	
	private String codigo;
	private String produto;
	private int qtdProdutos;
	private double precoUnit;
	
	public LojaVirtual(String codigo, String produto, int qtdProdutos, double precoUnit) {
		this.codigo = codigo;
		this.produto = produto;
		this.qtdProdutos = qtdProdutos;
		this.precoUnit = precoUnit;
	}
    
	@Override
	public String toString() {
		return codigo+"                "+produto+"                 "+qtdProdutos+"                 "+precoUnit+"\n";
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQtdProdutos() {
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

	public double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(double precoUnit) {
		this.precoUnit = precoUnit;
	}
	
	
	
}
