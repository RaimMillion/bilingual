package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "table_title")

@AllArgsConstructor
@NoArgsConstructor
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String idea;


    @Column(name = "checkBox")
    private boolean checkBox;

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Option options;


}
