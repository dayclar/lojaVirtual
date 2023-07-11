
public class LojaVirtualCompras {
	
	int codigo;
	int qtdProd;
	double valor;
    
	public int getCodigo() {
		return codigo;
	}
	public LojaVirtualCompras(int codigo, int qtdProd, double valor) {
		super();
		this.codigo = codigo;
		this.qtdProd = qtdProd;
		this.valor = valor;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
