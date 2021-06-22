package br.com.forum.config.validation;

public class ErroDeFormularioDto {

	private String campo;
	private String nomeErro;

	public ErroDeFormularioDto(String campo, String nomeErro) {
		super();
		this.campo = campo;
		this.nomeErro = nomeErro;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getNomeErro() {
		return nomeErro;
	}

	public void setNomeErro(String nomeErro) {
		this.nomeErro = nomeErro;
	}

}
