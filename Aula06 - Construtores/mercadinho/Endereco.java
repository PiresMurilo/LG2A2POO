package mercadinho;

public class Endereco {
		//atributos:
		private final static int id_padrao = 00;
		private final static boolean status_padrao = false;
		private final static int numero_padrao = 00;
		private final static String cep_padrao = "00000-000";
		private final static String rua_padrao = "Undefined";
		private final static String bairro_padrao = "Undefined";
	
		private int id;
		private boolean status;
		private int numero;
		private String cep, rua, bairro;
		
		//construtor padrão (sem parametros)
		public Endereco() {
			this(id_padrao, rua_padrao, numero_padrao, cep_padrao, bairro_padrao);
		}
		public Endereco(int id) {
			//this.setStatus(true);
			//this.setId(id);
			//System.out.println("Endereço incluso com sucesso!");
			this(id, rua_padrao, numero_padrao, cep_padrao, bairro_padrao);
		}
		
		//construtor com parâmetros
		public Endereco(int id, String rua) {
			//this.setId(id);
			//this.setRua(rua);
			//System.out.println("Rua " + this.getRua() + " inclusa com o id " + this.getId());
			this(id, rua, numero_padrao, cep_padrao, bairro_padrao);
		}
		
		//construtor com parâmetros
		public Endereco(int id, String rua, int numero) {
			//this.setId(id);
			//this.setRua(rua);
			//this.setNumero(numero);
			//System.out.println("Rua " + this.getRua() + ", número: " + this.getNumero() + " inclusa com o id " + this.getId());
			this(id, rua, numero, cep_padrao, bairro_padrao);
		}
		
		//construtor com parâmetros
		public Endereco(int id, String rua, int numero, String cep, String bairro) {
			this.setId(id);
			this.setRua(rua);
			this.setNumero(numero);
			this.setCep(cep);
			this.setBairro(bairro);
			System.out.println("Dados da rua " + this.getId() + " inclusos com sucesso!");
			System.out.println("Rua " + this.getRua() + ", número: " + this.getNumero());
			System.out.println("CEP: " + this.getCep() + " - Bairro: " + this.getBairro());
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
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			if(numero > 0 && numero < 9999999) {
				this.numero = numero;
			} else {
				this.numero = numero_padrao;
			}
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			if(!cep.isBlank()) {
				this.cep = cep;
			} else {
				this.cep = cep_padrao;
			}
		}
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			if(!rua.isBlank()) {
				this.rua = rua;
			} else {
				this.rua = rua_padrao;
			}
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			if(!bairro.isBlank()) {
				this.bairro = bairro;
			} else {
				this.bairro = bairro_padrao;
			}
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
		public void adicionarEndereco(int id){
			this.setId(id);
			if(this.status == true){
				System.out.println("Endereço " + this.getId() + " adicionado com sucesso!");
			} else {
				System.out.println("Endereço " + this.getId() + " não pôde ser adicionado!");
			}
		}
		public void verificarEndereco(){
			if(this.status == true){
				System.out.println("Endereço existente!");
			} else {
				System.out.println("Endereço inexistente!");
			}
		}
		public void editarEndereco(String cep, int numero, String rua, String bairro){
			this.setCep(cep);
			this.setNumero(numero);
			this.setRua(rua);
			this.setBairro(bairro);
			System.out.println("Endereço editado com sucesso!");
		}
		public void excluirEndereco(){
			this.setId(0);
			this.setCep(" ");
			this.setRua(" ");
			this.setNumero(0);
			this.setBairro(" ");
			this.setStatus(false);

			if(this.status == false){
				System.out.println("Endereço excluído com sucesso!");
			} else {
				System.out.println("Impossível excluir endereço!");
			}
		}
		

}
