package org.ecommerce.demo.model;

public class UsuarioLogin {
	
	private Long idUsuario;
	private String nome;
	private String foto;
	private String email;
	private String senha;
	private String token;
	private String rua;
	private String bairro;
	private Long numero;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	private String tipoUsuario;
	private Pedido pedidos;
	private ListaDeDesejos listaDeDesejos;
    
	
	
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Pedido getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
	public ListaDeDesejos getListaDeDesejos() {
		return listaDeDesejos;
	}
	public void setListaDeDesejos(ListaDeDesejos listaDeDesejos) {
		this.listaDeDesejos = listaDeDesejos;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
