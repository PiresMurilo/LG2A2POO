package mercadinho;

public class Produto {
		//atributos:
		public int id; //público pois é útil que a identificação do endereço seja acessível pelas demais classes
		public boolean status; //público pois o status deve ser acessível aos métodos de outras classes futuras
		private int quantidadeEstoque; //demais atributos são todos privados pois seus acessos devem ser apenas através dessa classe
		private String nome, marca, descricao;
		private float preco;
		
		//metodos principais: construtor e getters/setters:
		public Produto() {
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantidadeEstoque() {
			return quantidadeEstoque;
		}
		public void setQuantidadeEstoque(int quantidadeEstoque) {
			this.quantidadeEstoque = quantidadeEstoque;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		
		//métodos da aplicação:
		//todos os métodos são públicos para que sejam acessíveis pelas demais classes
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
