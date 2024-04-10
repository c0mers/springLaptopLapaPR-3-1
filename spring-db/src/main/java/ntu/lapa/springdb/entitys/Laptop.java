
package ntu.lapa.springdb.entitys;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Data
@Table(name = "laptops")

public class Laptop {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "processor",nullable = false)
    private String processor;
    @Column(name = "ram",nullable = false)
    private Integer ram;
    @Column(name = "screen_size",nullable = false)
    private String screen_size;
    @Column(name = "operating_system",nullable = false)
    private String operating_system;

}


