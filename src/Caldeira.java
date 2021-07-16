
public class Caldeira {
	//Variáveis atuais
	
	//Variaveis para alarmar aumento de temperatura, vazamento ou incêndio
	public float temperatura;
	public float volumeAgua;
	public boolean presencaFogo;
	
	//funções padroes
	public void setTemperatura(float i) {
		this.temperatura = i;
	}
	public float getTemperatura() {
		return this.temperatura;
	}
	public void setVolumeAgua(float i) {
		this.volumeAgua = i;
	}
	public float getVolumeAgua() {
		return this.volumeAgua;
	}
	public void setPresencaFogo(boolean i) {
		this.presencaFogo = i;
	}
	public boolean getPresencaFogo() {
		return this.presencaFogo;
	}
}
