package com.safeYourStep.yourSafeStepConfiguration;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@ComponentScan({"com.safeYourStep"})
//@PropertySource("${classpath:yourSafeStep.properties}")
public class HibernateConfiguration {
	
	
	  @Bean 
	  public LocalSessionFactoryBean sessionFactory() {
	  LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	  sessionFactory.setDataSource(dataSource());
	  sessionFactory.setPackagesToScan(new String[] {"com.safeYourStep.yourSafeStepEntity"});
	  sessionFactory.setHibernateProperties(hibernateProperties()); 
	  return sessionFactory; }
	 
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/yourSafeStep?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root123");
        return dataSource;
    }
	
		private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.format_sql", true);
        return properties;
		}
        
	
	  @Bean
	  @Autowired 
	  public HibernateTransactionManager transactionManager(SessionFactory s) {
		  HibernateTransactionManager txManager= new HibernateTransactionManager();
		  txManager.setSessionFactory(s); 
		  return txManager; 
		  }
}
