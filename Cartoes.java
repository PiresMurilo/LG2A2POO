package mercadinho;

public class Cartoes {
		//atributos:
		public boolean status; //público pois o status deve ser acessível aos métodos de outras classes futuras
		private String numero, dataVencimento, bandeira; //privados pois seus acessos devem ser apenas através dessa classe

		//metodos principais: construtor e getters/setters
		public Cartoes(){
			this.setStatus(true);
		}

		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getDataVencimento() {
			return dataVencimento;
		}
		public void setDataVencimento(String dataVencimento) {
			this.dataVencimento = dataVencimento;
		}
		public String getBandeira() {
			return bandeira;
		}
		public void setBandeira(String bandeira) {
			this.bandeira = bandeira;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		//métodos da aplicação:
		//todos os métodos são públicos para que sejam acessíveis pelas demais classes
		public void adicionarCartao(String numero){
			this.setNumero(numero);
			if(!this.numero.isEmpty() && this.status){
				System.out.println("Cartão adicionado com sucesso!");
			} else {
				System.out.println("Impossível adicionar cartão!");
			}
		}
		public void verificarVeracidade(){
			if(this.status == true){
				System.out.println("Cartão válido!");
			} else {
				System.out.println("Cartão inválido!");
			}
		}
		public void editarCartao(String numero, String dataVencimento, String bandeira){
			this.setNumero(numero);
			this.setDataVencimento(dataVencimento);
			this.setBandeira(bandeira);
			System.out.println("Cartão editado com sucesso!");
		}
		public void excluirCartao(){
			this.setNumero(" ");
			this.setDataVencimento(" ");
			this.setBandeira(" ");
			this.setStatus(false);
			if(this.status == false){
				System.out.println("Cartão excluído com sucesso!");
			} else {
				System.out.println("Impossível excluir cartão!");
			}
		}
		
}