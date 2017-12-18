/**
 * 
 */
package com.app.persistence.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Wilson Ortiz
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.app.persistence.dao")
@EntityScan(basePackages = "com.app.persistence.entities")
public class PersistenceConfiguration {

}
	