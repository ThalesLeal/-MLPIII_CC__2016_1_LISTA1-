import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//O arquivo: Data.java
public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));	
		this.dia = calendar.get(Calendar.DAY_OF_MONTH);
		this.mes = calendar.get(Calendar.MONTH)+1;
		this.ano = calendar.get(Calendar.YEAR);
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		this.ano = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
	}
	
	private boolean validDate(int dia, int mes, int ano){
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		df.setLenient(false);
		try {
			df.parse(dia+"/"+mes+"/"+ano);
			return true;
		}catch(ParseException ex){
			return false;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (validDate(dia, this.mes, this.ano)){
			this.dia = dia;
		}else{
			System.out.println("Dia inválido.");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (validDate(this.dia, mes, this.ano)){
			this.mes = mes;
		}else{
			System.out.println("Mes inválido.");
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (validDate(this.dia, this.mes, ano)){
			this.ano = ano;
		}else{
			System.out.println("Ano inválido.");
		}
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}