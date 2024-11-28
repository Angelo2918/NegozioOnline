package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

//@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer loginId;

    public UserLogin(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;
}
	