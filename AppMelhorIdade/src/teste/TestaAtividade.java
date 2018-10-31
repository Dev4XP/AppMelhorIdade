package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Atividade;
import negocio.Contato;
import negocio.Endereco;
import negocio.Voluntario;

public class TestaAtividade {
	public static void main(String[] args) {
		Contato contatoVoluntario = new Contato("987654321", "tamyidosa@gmail.com",
				"9987654321");

		Endereco enderecoVoluntario = new Endereco("Rua do lado", 300, "Barra", "Rio de Janeiro", "RJ");
		
		Voluntario voluntario = new Voluntario("tamy", 42, false, 3, contatoVoluntario,enderecoVoluntario, false);
		List<Voluntario> voluntarios = new ArrayList<>();
		voluntarios.add(voluntario);
		
        Calendar horaAtividade = Calendar.getInstance();
		DateFormat horaFormat = new SimpleDateFormat("HH:mm");
        try {
            Date data = (Date)horaFormat.parse("10:00");            
            horaAtividade.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}   
        
		Calendar dataAtividade = Calendar.getInstance();
		DateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = (Date)dataFormat.parse("22/10/2018");            
            dataAtividade.setTime(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}    
		Atividade atividade = new Atividade("Aulas de informatica para idosos", horaAtividade, dataAtividade, 
				2, 20, "Era uma casa muito engraçada", voluntarios);
		List<Atividade> listaAtividades = new ArrayList<>();
		listaAtividades.add(atividade);
		atividade.exibir();
	}
}
