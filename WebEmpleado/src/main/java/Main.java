import java.sql.SQLException;

import model.Cliente;
import repo.ClienteRepositorio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteRepositorio clienteRepo = new ClienteRepositorio();
		Cliente cliente = new Cliente();
		cliente.setId(3);
		cliente.setNombre("Marcela");
		try {
			clienteRepo.delete(3);
//			for(Cliente c: result) {
//				System.out.println(c);
//			}
//			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}

}
