package br.com.unicuritiba;

import br.com.unicuritiba.repository.PlayerRepository;
import br.com.unicuritiba.repository.Repository;
import br.com.unicuritiba.repository.WordRepository;

public class Application {

	public static void main(String[] args) {
		
		Repository repository = new WordRepository();
		
		repository.save("Creme");
		repository.save("arroz");
		repository.save("feijao");
		repository.save("pizza");
		repository.save("milho");
		
		repository = new PlayerRepository();
		repository.save("Joao");
		repository.save("Mateus");
		repository.save("Cris");
		repository.save("Ronaldo");
		repository.save("Jorge");

		
	}

}
