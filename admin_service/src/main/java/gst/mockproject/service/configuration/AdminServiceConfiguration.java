package gst.mockproject.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by dinhv on 3/26/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "gst.mockproject.databaseaccess")
public class AdminServiceConfiguration {
    @Bean
    public JavaMailSenderImpl javaMailSender()
    {
        return new JavaMailSenderImpl();
    }
}
