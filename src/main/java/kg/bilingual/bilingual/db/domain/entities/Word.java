package kg.bilingual.bilingual.db.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "word")
    private String word;

    @Column(name = "isTrue")
    private boolean isTrue;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private SelectRealEnglishWords selectRealEnglishWords;


}
