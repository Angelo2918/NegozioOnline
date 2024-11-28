package models;
import javax.validation.constraints.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String city;
    private String state;

    @Size(min=6,max=6, message="Pincode should be 6 digit")
    private String pincode;
    public Address(String city, String state, String pincode) {
        super();
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }


}
