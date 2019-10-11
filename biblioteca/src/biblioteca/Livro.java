package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livro implements Identificavel {
	@Id
private String editora;
private String titulo;
private int ano;
private Long id;
private String autor;
private int isbn;
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
@Override
public String toString() {
	return "Livro [editora=" + editora + ", titulo=" + titulo + ", ano=" + ano + ", id=" + id + ", autor=" + autor
			+ ", isbn=" + isbn + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Livro other = (Livro) obj;
	if (ano != other.ano)
		return false;
	if (autor == null) {
		if (other.autor != null)
			return false;
	} else if (!autor.equals(other.autor))
		return false;
	if (editora == null) {
		if (other.editora != null)
			return false;
	} else if (!editora.equals(other.editora))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (isbn != other.isbn)
		return false;
	if (titulo == null) {
		if (other.titulo != null)
			return false;
	} else if (!titulo.equals(other.titulo))
		return false;
	return true;
}

}
