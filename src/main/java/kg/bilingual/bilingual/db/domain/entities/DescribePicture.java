package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "descriptionPicture_table")
@AllArgsConstructor
@NoArgsConstructor
public class DescribePicture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;

    @Column(name = "picture")
    private String picture;

    //?
    @Column(name = "correct_answer")
    private int correctAnswer;


    //связь между таблицами Test и DescribePicture
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Test  test;
}
