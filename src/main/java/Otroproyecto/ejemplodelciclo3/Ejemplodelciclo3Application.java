package Otroproyecto.ejemplodelciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
public class Ejemplodelciclo3Application {
=======
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Ejemplodelciclo3Application {
	@GetMapping("/Hello")
	public String hello(){
		return "Hola este es tu primer comentario";
	}
>>>>>>> 758d993 (Hola mundo!)

	public static void main(String[] args) {
		SpringApplication.run(Ejemplodelciclo3Application.class, args);
	}

}
