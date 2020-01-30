package araneda.nicole.Tienda_Mascotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"araneda.nicole"})
@EntityScan("araneda.nicole.Model")
@EnableJpaRepositories("araneda.nicole.Repository")
public class TiendaMascotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaMascotasApplication.class, args);
	}
}