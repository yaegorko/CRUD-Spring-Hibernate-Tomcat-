package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"spring"})
public class WebConfig extends WebMvcConfigurerAdapter {

    /*
    переопределив метод addResourceHandlers мы сможем указать где будут лежать ресурсы нашего проекта,
    такие как css, image, js и другие.
     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");
//    }


//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//    }

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
