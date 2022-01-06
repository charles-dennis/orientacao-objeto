package br.com.dio.digitalInnovatione.DesafioPOO.model;


public class Cursos extends Conteudo {
	
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Cursos [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	

}