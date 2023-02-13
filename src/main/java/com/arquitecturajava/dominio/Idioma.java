package com.arquitecturajava.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="idiomas")
public class Idioma {
	@Id
	private int ididioma;
	private String idioma;
	
	@Override
	public String toString() {
		return "Idioma [ididioma=" + ididioma + ", idioma=" + idioma + "]";
	}
	public int getIdidioma() {
		return ididioma;
	}
	public void setIdidioma(int ididioma) {
		this.ididioma = ididioma;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
}
