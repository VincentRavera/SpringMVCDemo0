package fr.treeptik.springmvcsample.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:/config.properties")
@Import(value = {JPAConfig.class})
public class ApplicationConfiguration {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	

}
