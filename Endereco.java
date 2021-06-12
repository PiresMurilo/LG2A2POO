package mercadinho;

public class Endereco {
		//atributos:
		public int id; //público pois é útil que a identificação do endereço seja acessível pelas demais classes
		public boolean status; //público pois o status deve ser acessível aos métodos de outras classes futuras
		private int numero; //demais atributos são todos privados pois seus acessos devem ser apenas através dessa classe
		private String cep, rua, bairro;
		
		//metodos principais: construtor e getters/setters:
		public Endereco() {
			this.setStatus(true);
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		//métodos da aplicação:
		//todos os métodos são públicos para que sejam acessíveis pelas demais classes
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
