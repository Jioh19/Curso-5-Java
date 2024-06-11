package cl.bootcamp.java.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource datasource) {
		return new JdbcUserDetailsManager(datasource);
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(configurer -> 
					configurer
//							.requestMatchers("/empleados/**").hasRole("Empleado")
//							.requestMatchers("/jefes/**").hasRole("Jefe")
//							.requestMatchers("/instrucciones/**").hasRole("Jefe")
							.requestMatchers("/registro/**").permitAll()
							.requestMatchers("/crearUsuario/**").permitAll()
							.requestMatchers("/resultado/**").permitAll()
							.requestMatchers("/error/**").permitAll()
							.anyRequest().authenticated()
					)
					.formLogin(form ->
							form
								.loginPage("/paginaLogin")
								.loginProcessingUrl("/authenticateTheUser")
								.permitAll()
					)
					.logout(logout -> logout.permitAll()
					)
					.exceptionHandling(configurer ->
								configurer.accessDeniedPage("/accesoDenegado")
					);
		return http.build();
	}

}
