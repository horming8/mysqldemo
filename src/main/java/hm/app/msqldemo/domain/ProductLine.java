package hm.app.msqldemo.domain;

import java.sql.Blob;

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
@Table(name = "productlines")
public class ProductLine {
    
    @Id
    private String productLine;
    @Lob
    private String textDescription;
    @Lob
    private String htmlDescription;
    private Blob image;
}
