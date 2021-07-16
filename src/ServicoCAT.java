
public class ServicoCAT {
	public float temperaturaAnterior;
	public float temperaturaAtual;	
	//Atualiza dados da temeratura
	public void atualizarTemperatura(float i) {
		this.temperaturaAnterior = this.temperaturaAtual;
		this.temperaturaAtual = i;
	}	
	//Compara a temperatura registrada anteriormente com a temperatura atual.
	public float comparacaoTemperatura() {
		return this.temperaturaAtual - temperaturaAnterior;
	}	
	// Verifica se a variação foi repentina
	public boolean aumentoRepentino() {
		if (comparacaoTemperatura() > 5) {
			return true;
		}
		else {
			return false;
		}
	}	
	//Verifica se a temperatura é igual ou superior a 200. 
	public boolean temperaturaCritica() {
		if(this.temperaturaAtual>= 200) {
			return true;
		}
		else {
			return false;
		}
	}	
}
