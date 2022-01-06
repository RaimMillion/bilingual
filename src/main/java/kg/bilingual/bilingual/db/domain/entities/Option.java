package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "option_table")

@AllArgsConstructor
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "idea")
    private String idea;


    @Column(name = "isTrue")
    private boolean isTrue;

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Title titles;

    //связь между таблицами Test и Option
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
//    @JoinColumn
    private Test test;
}
