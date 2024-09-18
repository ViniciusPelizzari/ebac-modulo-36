/**
 * 
 */
package example.springdata.multistore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Vinícius Pelizzari
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = "example.springdata.multistore.customer")
public class JpaConfig {

}
