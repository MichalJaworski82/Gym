package com.mj.project.mjmavenproj1.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@Configuration
@EnableAutoConfiguration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


	@Autowired
	private DataSource dataSource;


	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select Email, Haslo, enabled from Uzytkownik where Email=?")
				.authoritiesByUsernameQuery("select Email, RolaNazwa from Rola where Email=?")
				.passwordEncoder(bCryptPasswordEncoder());
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/gymindex","/gymgym", "/gymplanner",
				"/gymtrainers","/gympricing","/gymlogin",
				"/gyminvalidlogin","/createDummyUser", "/tp", "/test2").permitAll()
				.antMatchers("/gymMyProfileTrener").access("hasRole('TRENER')")
				.antMatchers("/gymMyProfileKlient").access("hasRole('KLIENT')")
				.antMatchers("/gymMyProfilePracownik").access("hasRole('PRACOWNIK')")
				.antMatchers("/gymcontrolpanel","/*CP*/**").access("hasRole('ADMIN')")
				//.anyRequest().authenticated()
				.and()
				.formLogin()
					.loginPage("/gymlogin")
					.loginProcessingUrl("/authenticateTheUser")
					.defaultSuccessUrl("/gymindex")
					.permitAll()
					.failureUrl("/gyminvalidlogin")
				.and()
				.logout().permitAll();

	}

	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/common/**");
		web.ignoring().antMatchers("/img/**");
		web.ignoring().antMatchers("/css/**");

	}

}


