package banco_superior.modelo;

import banco_superior.persistencia.PersistenciaEmArquivoCliente;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersistenciaEmArquivoCliente pac = new PersistenciaEmArquivoCliente();

		ICliente obj = pac.localizarClientePorCPF("000");
		
		System.out.println(obj);
		
	}

}
