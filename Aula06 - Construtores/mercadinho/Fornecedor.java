package mercadinho;

public class Fornecedor {
		//atributos:
		private final static int id_padrao =00;
		private final static boolean status_padrao = false;
		private final static String telefone_padrao = "(00) 00000-0000";
		private final static String endereco_padrao = "Undefined";
		
		public int id;
		public boolean status;
		private String telefone, endereco;
		
		//construtor padrão (sem parametros)
		public Fornecedor() {
			//this.setStatus(true);
			//System.out.println("Fornecedor incluso com sucesso!");
			this(id_padrao, telefone_padrao, endereco_padrao);
		}
		
		//construtor com id
		public Fornecedor(int id) {
			//this.setId(id);
			//this.setStatus(true);
			//System.out.println("Fornecedor iniciado no sistema. Por favor realize o cadastro das demais informações necessárias");
			this(id, telefone_padrao, endereco_padrao);
		}
		
		//construtor com id e telefone
		public Fornecedor(int id, String telefone) {
			//this.setId(id);
			//this.setTelefone(telefone);
			//this.setStatus(true);
			//System.out.println("Fornecedor " + this.getId() + " incluso com sucesso!");
			this(id, telefone, endereco_padrao);
		}
		
		//construtor com id, telefone e endereço
		public Fornecedor(int id, String telefone, String endereco) {
			this.setId(id);
			this.setTelefone(telefone);
			this.setEndereco(endereco);
			this.setStatus(true);
			System.out.println("Fornecedor incluso com sucesso!");
			
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
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			if(!telefone.isBlank()) {
				this.telefone = telefone;
			} else {
				this.telefone = telefone_padrao;
			}
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			if(!endereco.isBlank()) {
				this.endereco = endereco;
			} else {
				this.endereco = endereco_padrao;
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
