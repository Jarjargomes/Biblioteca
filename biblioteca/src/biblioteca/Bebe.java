package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bebe {
	@Id
private String nome;
	private Long id;
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
private int peso;
private double altura;
private String medicoresponsavel;
private String maebebe;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public String getMedicoresponsavel() {
	return medicoresponsavel;
}
public void setMedicoresponsavel(String medicoresponsavel) {
	this.medicoresponsavel = medicoresponsavel;
}
public String getMaebebe() {
	return maebebe;
}
public void setMaebebe(String maebebe) {
	this.maebebe = maebebe;
}
@Override
public String toString() {
	return "Bebe [nome=" + nome + ", id=" + id + ", peso=" + peso + ", altura=" + altura + ", medicoresponsavel="
			+ medicoresponsavel + ", maebebe=" + maebebe + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bebe other = (Bebe) obj;
	if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (maebebe == null) {
		if (other.maebebe != null)
			return false;
	} else if (!maebebe.equals(other.maebebe))
		return false;
	if (medicoresponsavel == null) {
		if (other.medicoresponsavel != null)
			return false;
	} else if (!medicoresponsavel.equals(other.medicoresponsavel))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (peso != other.peso)
		return false;
	return true;
}

}
