package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "record_table")
@AllArgsConstructor
@NoArgsConstructor
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;

    @Column(name = "audio")
    private String audio;

    //?
    @Column(name = "statement")
    private int statement;


    //связь между таблицами Test и Record
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Test  test;
}
