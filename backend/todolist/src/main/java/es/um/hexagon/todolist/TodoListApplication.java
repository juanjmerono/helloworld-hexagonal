package es.um.hexagon.todolist;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={WebMvcAutoConfiguration.class})
public class TodoListApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
	}

	@Bean
	ConnectionFactoryInitializer initializer(@Qualifier("connectionFactory") ConnectionFactory connectionFactory) {
	  ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
	  initializer.setConnectionFactory(connectionFactory);
	  /*ResourceDatabasePopulator resource =
		  new ResourceDatabasePopulator(new ClassPathResource("schema.sql"));
	  initializer.setDatabasePopulator(resource);*/
	  return initializer;
	}	
}
