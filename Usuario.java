package mercadinho;

public class Usuario {
		//atributos:
		public int id; //público pois é útil que a identificação do endereço seja acessível pelas demais classes
		public boolean status; //público pois o status deve ser acessível aos métodos de outras classes futuras
		private String nome, cpf, telefone, email, senha, historico; //privados pois seus acessos devem ser apenas através dessa classe
		
		//metodos principais: construtor e getters/setters:
		public Usuario() {
			this.setStatus(true);
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getHistorico() {
			return historico;
		}
		public void setHistorico(String historico) {
			this.historico = historico;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		//métodos da aplicação:
		//todos os métodos de aplicação são públicos para que sejam acessíveis pelas demais classes
		public void adicionarUsuario(int id){
			this.setId(id);
			if(this.status == true){
				System.out.println("Usuário " + this.getId() + " adicionado com sucesso!");
			} else {
				System.out.println("Usuário " + this.getId() + " não pôde ser adicionado!");
			}
		}
		public void verificar(){
			if(this.status == true){
				System.out.println("Usuário possui conta!");
			} else {
				System.out.println("Usuário inexistente!");
			}
		}
		public void editarUsuario(String nome, String cpf, String telefone){
			this.setNome(nome);
			this.setCpf(cpf);
			this.setTelefone(telefone);
			System.out.println("Usuário editado com sucesso!");
		}
		public void excluirUsuario(){
			if(this.status == true){
				this.setId(0);
				this.setNome(" ");
				this.setCpf(" ");
				this.setTelefone(" ");
				this.setEmail(" ");
				this.setSenha(" ");
				this.setStatus(false);
				this.setHistorico(" ");
				System.out.println("Usuário excluído com sucesso!");
			} else {
				System.out.println("Impossível excluir usuário!");
			}
		}
		public void adicionarHistorico(String historico){
			this.setHistorico(this.getHistorico() + historico);
			//historico += historico; adicionar o historico novo junto com o antigo
		}
		public void visualizarHistorico(){
			if(!this.historico.isEmpty()){
				System.out.println("Histórico: " + this.getHistorico());
			} else {
				System.out.println("Histórico vazio!");
			}
		}
}
