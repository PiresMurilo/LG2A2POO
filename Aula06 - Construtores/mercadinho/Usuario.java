package mercadinho;

public class Usuario {
		//atributos:
		private final static int id_padrao = 00; 
		private final static boolean status_padrao = false; 
		private final static String nome_padrao = "Undefined";
		private final static String cpf_padrao = "00000000000";
		private final static String telefone_padrao = "Undefined";
		private final static String email_padrao = "Undefined";
		private final static String senha_padrao = "0000";
		private final static String historico_padrao = "Undefined";
		
		private int id;
		private boolean status;
		private String nome, cpf, telefone, email, senha, historico;
		
		//construtor padrão (sem parametros)
		public Usuario() {
			//this.setStatus(true);
			//System.out.println("Usuário criado com sucesso!");
			this(id_padrao, nome_padrao);
		}
		
		//construtor com id, nome
		public Usuario(int id, String nome) {
			//this.setId(id);
			//this.setNome(nome);
			//this.setStatus(true);
			//System.out.println("Usuário " + this.getId() + " criado com sucesso com o nome de " + this.getNome() + "!");
			this(id, nome, email_padrao, senha_padrao);
		}
		
		//construtor com id, nome, email e senha
		public Usuario(int id, String nome, String email, String senha) {
			this.setId(id);
			this.setNome(nome);
			this.setEmail(email);
			this.setSenha(senha);
			this.setStatus(true);
			System.out.println("Usuário " + this.getId() + " criado com sucesso!");
			System.out.println("Seja bem vindo(a) " + this.getNome() + ". E-mail e senha cadastrados com sucesso!");
		}
		
		//getters e setters:
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
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			if(!nome.isBlank()) {
				this.nome = nome;
			} else {
				this.nome = nome_padrao;
			}
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			if(!cpf.isBlank()) {
				this.cpf = cpf;
			} else {
				this.cpf = cpf_padrao;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			if(!email.isBlank()) {
				this.email = email;
			} else {
				this.email = email_padrao;
			}
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			if(!senha.isBlank()) {
				this.senha = senha;
			} else {
				this.senha = senha_padrao;
			}
		}
		public String getHistorico() {
			return historico;
		}
		public void setHistorico(String historico) {
			if(!historico.isBlank()) {
				this.historico = historico;
			} else {
				this.historico = historico_padrao;
			}
		}
		
		
		//métodos da aplicação:
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