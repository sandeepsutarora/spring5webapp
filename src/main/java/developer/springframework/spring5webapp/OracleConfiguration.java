package developer.springframework.spring5webapp;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

/*https://dzone.com/articles/configuring-spring-boot-for-oracle*/

@Configuration
@ConfigurationProperties("spring.datasource")
public class OracleConfiguration {
    @NotNull
    private String URL;

    @NotNull
    private String username;

    @NotNull
    private String password;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


 @Bean
 OracleDataSource dataSource() throws SQLException
 {
     OracleDataSource ds = new OracleDataSource();
     ds.setUser(username);
     ds.setPassword(password);
     ds.setURL(URL);
     ds.setImplicitCachingEnabled(true);
     ds.setFastConnectionFailoverEnabled(true);
     return ds;
 }
}

