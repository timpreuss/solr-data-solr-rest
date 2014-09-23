package gov.epa.aqs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration 
@ComponentScan("gov.epa.aqs")
@EnableWebMvc   
public class AppConfig {

  @Bean
 public UrlBasedViewResolver setupViewResolver() {
 UrlBasedViewResolver resolver = new UrlBasedViewResolver();
 resolver.setPrefix("/WEB-INF/views/");
 resolver.setSuffix(".jsp");
 resolver.setViewClass(JstlView.class);
 return resolver;
 }

}  
