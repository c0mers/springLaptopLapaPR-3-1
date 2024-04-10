package ntu.lapa.springdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDbApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDbApplication.class, args);

	}

}


//Варіант 5. Клас: Ноутбук (Laptop)
//
//Поля:
// ID (id),
// Назва (name),
// Процесор (processor),
// ОЗП (ram),
// Розмір Екрану (screenSize),
// пераційна Система (operatingSystem)