package com.iiht.fse.SellerService.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.NonFinal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonFinal
@Document(collection = "bid")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bid {

    @Id
    String id;

    @NotNull(message = "productId cannot be blank")
    String productId;

    @NotNull(message = "first name cannot be empty")
    @Size(min = 5,max = 30)
    String firstName;

    @NotNull(message = "last name cannot be empty")
    @Size(min = 3,max = 25)
    String lastName;

    @NotNull(message = "Address cannot be empty")
    String address;

    String city;

    String state;

    String pin;

    @NotNull(message = "Phone cannot be empty")
    @Pattern(regexp="^\\(?(\\d{10})\\)$",
            message="Mobile number is invalid")
    String phone;

    @NotNull(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    String email;

    @NotNull(message = "BidAmount cannot be empty")
    BigDecimal bidAmount;

}
