package mercadinho;

public class Cartoes {
		//atributos:
		private final static boolean status_padrao = false;
		private final static String numero_padrao = "0000 0000 0000 0000";
		private final static String data_padrao = "00/00";
		private final static String bandeira_padrao = "Undefined";
		
		public boolean status;
		private String numero, dataVencimento, bandeira;
		
		//construtor padrão (sem parâmetros)
		public Cartoes(){
			//this.setStatus(false);
			//System.out.println("Cartão incluso com sucesso!");
			this(numero_padrao);
		}
		
		//construtor com numero
		public Cartoes(String numero){
			//this.setStatus(false);
			//this.setNumero(numero);
			//System.out.println("Cartão incluso com sucesso!");
			this(numero, data_padrao, bandeira_padrao);
		}
		
		//construtor com parâmetros
		public Cartoes(String numero, String dataVencimento, String bandeira) {
			this.setNumero(numero);
			this.setDataVencimento(dataVencimento);
			this.setBandeira(bandeira);
			System.out.println("Cartão " + this.getBandeira() + " incluso com sucesso!");
		}

		//getters/setters
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			if(!numero.isBlank()) {
				this.numero = numero;
			} else {
				this.numero = numero_padrao;
			}
		}
		public String getDataVencimento() {
			return dataVencimento;
		}
		public void setDataVencimento(String dataVencimento) {
			if(!dataVencimento.isBlank()) {
				this.dataVencimento = dataVencimento;
			} else {
				this.dataVencimento = data_padrao;
			}
		}
		public String getBandeira() {
			return bandeira;
		}
		public void setBandeira(String bandeira) {
			if(!bandeira.isBlank()) {
				this.bandeira = bandeira;
			} else {
				this.bandeira = bandeira_padrao;
			}
			this.bandeira = bandeira;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			if(status == true) {
				this.status = status;
			} else {
				this.status = status_padrao;
			}
		}
		
		//métodos da aplicação:
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