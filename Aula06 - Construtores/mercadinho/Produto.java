package mercadinho;

public class Produto {
		//atributos:
		private final static int id_padrao = 00;
		private final static boolean status_padrao = false;
		private final static int quantidade_padrao = 00;
		private final static String nome_padrao = "Undefined";
		private final static String marca_padrao = "Undefined";
		private final static String descricao_padrao = "Undefined";
		private final static float preco_padrao = 00f;
		
		public int id;
		public boolean status;
		private int quantidadeEstoque;
		private String nome, marca, descricao;
		private float preco;
		
		//construtor:
		public Produto() {
			this(id_padrao, nome_padrao, preco_padrao);
		}
		public Produto(int id) {
			//this.setStatus(true);
			//System.out.println("Produto incluso com sucesso!");
			this(id, nome_padrao, preco_padrao);
		}
		
		//construtor com id e nome
		public Produto(int id, String nome) {
			//this.setId(id);
			//this.setNome(nome);
			//System.out.println("Produto " + this.getNome() + " incluso com sucesso com o id " + this.getId());
			this(id, nome, preco_padrao);
		}
		
		//construtor com id, nome e preço
		public Produto(int id, String nome, float preco) {
			this.setId(id);
			this.setNome(nome);
			this.setPreco(preco);
			System.out.println("Produto " + this.getId() + " incluso com sucesso!");
			System.out.println(this.getNome() + " - R$ " + this.getPreco());
		}
		
		//construtor com id, nome, marca e preco
		public Produto(int id, String nome, String marca, float preco) {
			this.setId(id);
			this.setNome(nome);
			this.setMarca(marca);
			this.setPreco(preco);
			System.out.println("Produto " + this.getId() + " incluso com sucesso!");
			System.out.println(this.getNome() + ", ® " + this.getMarca());
			System.out.println("Preço: R$ " + this.getPreco());
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
		public int getQuantidadeEstoque() {
			return quantidadeEstoque;
		}
		public void setQuantidadeEstoque(int quantidadeEstoque) {
			if(quantidadeEstoque > 0 && quantidadeEstoque < 9999999) {
				this.quantidadeEstoque = quantidadeEstoque;
			} else {
				this.quantidadeEstoque = quantidade_padrao;
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
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			if(!marca.isBlank()) {
				this.marca = marca;
			} else {
				this.marca = marca_padrao;
			}
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			if(!descricao.isBlank()) {
				this.descricao = descricao;
			} else {
				this.descricao = descricao_padrao;
			}
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			if(preco > 0.0f && id < 999999.9f) {
				this.preco = preco;
			} else {
				this.preco = preco_padrao;
			}
		}
		
		//métodos da aplicação:
		public void verificarDisponibilidade(){
			if(this.quantidadeEstoque > 0){
				System.out.println("Produto disponível! Possuímos " + this.getQuantidadeEstoque() + " em estoque.");
			} else {
				System.out.println("Produto indisponível em nosso estoque.");
			}
		}
		public void adicionarProduto(int id){
			this.setId(id);;
			if(this.status){
				System.out.println("Produto " + this.getId() + " adicionado com sucesso!");
			} else {
				System.out.println("Impossível adicionar o produto " + this.getId() + "!");
			}
		}
		public void editarProduto(String nome, String marca, float preco, int quantidade){
			this.setNome(nome);
			this.setMarca(marca);
			this.setPreco(preco);
			this.setQuantidadeEstoque(quantidade);
			System.out.println("Produto editado com sucesso!");
		}
		public void descreverProduto(String descricao){
			this.setDescricao(descricao);
		}
		public void excluirProduto(){
			this.setId(0);
			this.setStatus(false);
			this.setNome(nome);
			this.setMarca(marca);
			this.setDescricao(descricao);
			this.setPreco(0f);
			this.setQuantidadeEstoque(quantidadeEstoque);
			if(this.status == false){
				System.out.println("Produto excluído com sucesso!");
				
			} else {
				System.out.println("Impossível excluir produto!");
			}
		}
}
