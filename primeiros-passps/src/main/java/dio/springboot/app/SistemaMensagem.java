package dio.springboot.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

	@Value("${name: NoReplyDIO}")
	private String nome = "Fernanda Siqueira";
	@Value("${email}")
	private String email =  "fer@exemplo.com";
	@Value("${telefones}")
	private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] {11998853214L}));
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviado por: " + nome
				+ "\nEmail: " + email
				+ "\nCom tel: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}
	
	
}
