package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autores implements Identificavel {
	@Id
private String nome;
private Long id;
private String nacionalidade;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
@Override
public String toString() {
	return "Autores [nome=" + nome + ", id=" + id + ", nacionalidade=" + nacionalidade + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Autores other = (Autores) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nacionalidade == null) {
		if (other.nacionalidade != null)
			return false;
	} else if (!nacionalidade.equals(other.nacionalidade))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}









}
