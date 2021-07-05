package mercadinho;

public class Estoque {
		//atributos:
		private final static int id_padrao = 00;
		private final static int entrada_padrao = 00;
		private final static int saida_padrao = 00;
		private final static int saldo_padrao = 00;
		
		public int id;
		private int entrada, saida, saldo;
		
		//construtor padrão
		public Estoque() {
			this(id_padrao, entrada_padrao);
		}
		public Estoque(int id) {
			//this.setId(id);
			//System.out.println("Controle de estoque criado com sucesso!");
			this(id, entrada_padrao);
		}
		
		//construtor com id e entrada
		public Estoque(int id, int entrada) {
			this.setId(id);
			this.setEntrada(entrada);
			System.out.println("Controle de estoque alterado com sucesso! Número de entrada(s): " + this.getEntrada());
		}
		
		//getters/setters:
		public int getId() {
			return id;
		}
		public void setId(int id) {
			if(id > 0 && id < 9999999) {
				this.id = id;
			} else {
				this.id = id_padrao;
			}
		}
		public int getEntrada() {
			return entrada;
		}
		public void setEntrada(int entrada) {
			if(entrada > 0 && entrada < 9999999) {
				this.entrada = entrada;
			} else {
				this.entrada = entrada_padrao;
			}
		}
		public int getSaida() {
			return saida;
		}
		public void setSaida(int saida) {
			if(saida > 0 && saida < 9999999) {
				this.saida = saida;
			} else {
				this.saida = saida_padrao;
			}
		}
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
			if(saldo > 0 && saldo < 9999999) {
				this.saldo = saldo;
			} else {
				this.saldo = saldo_padrao;
			}
		}
		
		//métodos da aplicação:
		public void consultarEstoque(){
			if(this.getSaldo() <= 0){
				System.out.println("Produto indisponível!");
			} else {
				System.out.println("Produto em estoque!");
			}
		}
		public void adicionarProdutoEstoque(int quantidade){
			this.setSaldo(this.getSaldo() + quantidade);
			System.out.println("Produto adicionado com sucesso!");
			System.out.println("Agora temos " + this.getSaldo() + " em estoque");
		}
		public void excluirProdutoEstoque(int quantidade){
			this.setSaldo(this.getSaldo() - quantidade);
			System.out.println("Produto excluído com sucesso!");
			System.out.println("Agora temos " + this.getSaldo() + " em estoque");
		}
		/* public int gerarSaldo() {
			
		} */
}