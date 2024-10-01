package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idusuario;

	private String clave;







	private String password;

	private String passwordT1;

	private String usuario;



	private String usuarioT1;

	public TblUsuario() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}





	



	

	

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordT1() {
		return this.passwordT1;
	}

	public void setPasswordT1(String passwordT1) {
		this.passwordT1 = passwordT1;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}









	public String getUsuarioT1() {
		return this.usuarioT1;
	}

	public void setUsuarioT1(String usuarioT1) {
		this.usuarioT1 = usuarioT1;
	}

}