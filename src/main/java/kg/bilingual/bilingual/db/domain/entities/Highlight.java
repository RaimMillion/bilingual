package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "highlight_table")
@AllArgsConstructor
@NoArgsConstructor
public class Highlight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;
    @Column(name = "passage")
    private String passage;

    @Column(name = "question_statement")
    private String questionStatement;




    //связь между таблицами Test и Highlight
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
//    @JoinColumn
    private Test  test;
}
