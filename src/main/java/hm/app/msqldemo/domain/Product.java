package hm.app.msqldemo.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    
    @Id
    private String productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    
    @Lob
    private String productDescription;
    private Long quantityInStock;
    private BigDecimal buyPrice;
    private BigDecimal MSRP;

}
