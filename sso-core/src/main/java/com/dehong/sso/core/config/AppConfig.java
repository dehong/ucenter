package com.dehong.sso.core.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan(basePackages = "com.dehong.sso.core", 
	includeFilters = { @Filter(value = Configuration.class) }, 
	excludeFilters = { @Filter(value = Controller.class) })
@PropertySource("classpath:application.properties")
public class AppConfig 
{
	
   @Autowired
   private Environment env;
   
	@Bean("dataSource")
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDbType(env.getProperty("jdbc.dbtype"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        return dataSource;
    }   
	
	/**
	 * 必须加上static
	 */
	@Bean
	public static PropertyPlaceholderConfigurer loadProperties() 
	{
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		ClassPathResource resource = new ClassPathResource("application.properties");
		ClassPathResource mqResource = new ClassPathResource("mq.properties");
		configurer.setLocations(resource,mqResource);
		configurer.setIgnoreResourceNotFound(true);
		return configurer;
	}
	
	 @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	
	@Bean
	public SpringDomaConfig domaConfig()
	{
		return new SpringDomaConfig();
	}
	
}