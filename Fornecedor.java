package mercadinho;

public class Fornecedor {
		//atributos:
		public int id; //público pois é útil que a identificação do endereço seja acessível pelas demais classes
		public boolean status; //público pois o status deve ser acessível aos métodos de outras classes futuras
		private String telefone, endereco; //privados pois seus acessos devem ser apenas através dessa classe
		
		//metodos principais: construtor e getters/setters:
		public Fornecedor() {
			this.setStatus(true);
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		//métodos da aplicação:
		//todos os métodos são públicos para que sejam acessíveis pelas demais classes
		public void consultarFornecedor(int id){
			if(this.getStatus() == true) {
				System.out.println("Forncecedor " + this.getId() + " encontrado!");
			} else {
				System.out.println("Fornecedor não encontrado!");
			}
		}
		public void adicionarFornecedor(int id){
			this.setId(id);
			if(this.status == true){
				System.out.println("Fornecedor " + this.getId() + " adicionado com sucesso!");
			} else {
				System.out.println("Fornecedor " + this.getId() + " não pôde ser adicionado!");
			}
		}
		public void editarFornecedor(int id, String telefone, String endereco){
			this.setId(id);
			this.setTelefone(telefone);
			this.setEndereco(endereco);
			System.out.println("Fornecedor " + this.getId() + " editado com sucesso!");
		}
		public void excluirFornecedor(){
			if(this.getStatus() == true) {
				this.setId(0);
				this.setTelefone(" ");
				this.setEndereco(" ");
				this.setStatus(false);
				System.out.println("Fornecedor excluído com sucesso!");
			} else {
				System.out.println("Impossível excluir fornecedor!");
			}
		}
}
