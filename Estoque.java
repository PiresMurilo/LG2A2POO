package mercadinho;

public class Estoque {
		//atributos:
		public int id; //público pois é útil que a identificação do endereço seja acessível pelas demais classes
		private int entrada, saida, saldo; //privados pois seus acessos devem ser apenas através dessa classe
		
		//metodos principais: construtor e getters/setters:
		public Estoque() {
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getEntrada() {
			return entrada;
		}
		public void setEntrada(int entrada) {
			this.entrada = entrada;
		}
		public int getSaida() {
			return saida;
		}
		public void setSaida(int saida) {
			this.saida = saida;
		}
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
		
		//métodos da aplicação:
		//todos os métodos são públicos para que sejam acessíveis pelas demais classes
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
}