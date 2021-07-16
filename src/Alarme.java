
public class Alarme {
	public boolean alarmeCrit;
	public boolean alarmeRepentino;
	
	public void atualizarAlarmeRepentino(ServicoCAT i) {		
		this.alarmeRepentino = i.aumentoRepentino();
	}
	public void atualizarAlarmeCrit(ServicoCAT i) {		
		this.alarmeCrit = i.temperaturaCritica();
	}
	public void situacaoCaldeira() {
		System.out.println("Temperatura Crítica: "+ alarmeCrit);
		System.out.println("Aumento repentino de Temperatura: "+ alarmeRepentino);
	}
}
