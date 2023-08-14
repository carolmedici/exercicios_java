package aplicacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidade.Contrato;
import entidade.parcela;
import Servico.ContratoServico;
import Servico.ServicoPaypal;


public class Programa_Pagamento {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
			
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		
		Contrato obj = new Contrato(numero, data, valorContrato);
		
		
		System.out.println("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContratoServico servicoContrato = new ContratoServico(new ServicoPaypal());
		
		servicoContrato.processoContrato(obj, parcelas);
		
		
		System.out.println();
		System.out.println("Parcelas: ");
		for (parcela parcela : obj.getParcelas()) {
			System.out.println(parcela);
		}
		
		
		sc.close();
	}

}