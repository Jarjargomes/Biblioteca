package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements Identificavel {
	@Id
private String descricao;
private int codcategoria;
private Long id;
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public int getCodcategoria() {
	return codcategoria;
}
public void setCodcategoria(int codcategoria) {
	this.codcategoria = codcategoria;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Override
public String toString() {
	return "Categoria [descricao=" + descricao + ", codcategoria=" + codcategoria + ", id=" + id + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Categoria other = (Categoria) obj;
	if (codcategoria != other.codcategoria)
		return false;
	if (descricao == null) {
		if (other.descricao != null)
			return false;
	} else if (!descricao.equals(other.descricao))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}
