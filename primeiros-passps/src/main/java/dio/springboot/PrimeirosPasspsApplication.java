package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.app.SistemaMensagem;

@SpringBootApplication
public class PrimeirosPasspsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPasspsApplication.class, args);
	}
		@Bean
		public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
			return args -> {
				sistema.enviarConfirmacaoCadastro();
				sistema.enviarMensagemBoasVindas();
				sistema.enviarConfirmacaoCadastro();
			};
		}
	
	

}
