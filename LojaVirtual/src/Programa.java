import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
	    Scanner ent = new Scanner(System.in);
		LojaVirtual produtos[] = new LojaVirtual[10];
		produtos[0] = new LojaVirtual("1", "Arroz",10,23.99);
		produtos[1] = new LojaVirtual("2", "Feijão",10,8.99);
	    produtos[2] = new LojaVirtual("3", "Açúcar",10,14.99);
	    produtos[3] = new LojaVirtual("4", "Vinho",10,99.99);
	    produtos[4] = new LojaVirtual("5", "Cereal",10, 9.99);
		produtos[5] = new LojaVirtual("6", "Miojo",10,1.99);
	    produtos[6] = new LojaVirtual("7", "Sabão",10,2.99);
	    produtos[7] = new LojaVirtual("8", "Leite",10,4.57);
		produtos[8] = new LojaVirtual("9", "Óleo",10,5.99);
		produtos[9] = new LojaVirtual("10", "Azeite",10,12.99);
        List<LojaVirtualCompras> carrinhoCompras = new ArrayList<>();
		char sn;
        
		do {;
		System.out.println("========================================================================\n"
	     + "                                   Produtos\n"
		 + "========================================================================\n"
		 + "CÓDIGO           PRODUTO            QTD. PRODUTO          PREÇO UNIT");

		for(int x = 0;x <= 9;x++) {
		System.out.print(produtos[x].toString());
		}
		System.out.println("Olá, digite o código do produto desejado: ");
		int codigo = ent.nextInt();
		System.out.println("Insira a quantidade desejada do produto: ");
		int qtdProdutos = ent.nextInt();
		codigo = codigo -1;
		produtos[codigo].setQtdProdutos(produtos[codigo].getQtdProdutos() - qtdProdutos);
		LojaVirtualCompras lojaVirtualCompras = new LojaVirtualCompras(codigo, qtdProdutos, produtos[codigo].getPrecoUnit());
		carrinhoCompras.add(lojaVirtualCompras);
		ent.nextLine();
		System.out.println("Deseja continuar a sua compra? [S/N]");
	    sn = ent.nextLine().charAt(0);
        } while(sn != 'n');
	}
		
	}

