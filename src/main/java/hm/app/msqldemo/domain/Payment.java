package hm.app.msqldemo.domain;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {
    
    @Id
    private Long customerNumber;
    private String checkNumber;
    private Date paymentDate;
    private BigDecimal amount;

}
