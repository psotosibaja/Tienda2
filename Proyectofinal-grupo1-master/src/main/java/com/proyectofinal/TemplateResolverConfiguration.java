
package com.proyectofinal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {
    @Bean
public SpringResourceTemplateResolver resolver_0(){
    SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
    
    plantilla.setPrefix("classpath:/templates");
    plantilla.setSuffix(".html");
    plantilla.setTemplateMode(TemplateMode.HTML);
    plantilla.setCharacterEncoding("UTF-8");
    plantilla.setOrder(0);
    plantilla.setCheckExistence(true);
    return plantilla;
}

@Bean
public SpringResourceTemplateResolver resolver_1(){
    SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
    
    plantilla.setPrefix("templates/retro/");
    plantilla.setSuffix(".html");
    plantilla.setTemplateMode(TemplateMode.HTML);
    plantilla.setCharacterEncoding("UTF-8");
    plantilla.setOrder(1);
    plantilla.setCheckExistence(true);
    return plantilla;
}

@Bean
public SpringResourceTemplateResolver resolver_2(){
    SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
    
    plantilla.setPrefix("templates/other/");
    plantilla.setSuffix(".html");
    plantilla.setTemplateMode(TemplateMode.HTML);
    plantilla.setCharacterEncoding("UTF-8");
    plantilla.setOrder(2);
    plantilla.setCheckExistence(true);
    return plantilla;
}
    
}
