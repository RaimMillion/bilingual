package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ListenAndType_table")
@AllArgsConstructor
@NoArgsConstructor
public class ListenAndType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;

    @Column(name = "attempt")
    private int attempt;
//?
    @Column(name = "correct_answer")
    private int correctAnswer;
//?
    @Column(name = "audio")
    private String audio;

//связь между таблицами Test и ListenAndType
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private Test test;



}
