package hm.app.msqldemo.domain;

import java.math.BigDecimal;

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
@Table(name = "orderdetails")
public class OrderDetail {
    
    @Id
    private Long orderNumber;
    private String productCode;
    private Long quantityOrdered;
    private BigDecimal priceEach;
    private Long orderLineNumber;

}
