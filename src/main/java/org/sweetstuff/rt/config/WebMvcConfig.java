package org.sweetstuff.rt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author stupak
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.sweetstuff.rt.web" })
public class WebMvcConfig {
    
}
