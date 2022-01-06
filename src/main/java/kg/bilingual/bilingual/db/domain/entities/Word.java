package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "words")
@AllArgsConstructor
@NoArgsConstructor
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "word")
    private String word;

    @Column(name = "isTrue")
    private boolean isTrue;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private SelectRealEnglishWords selectRealEnglishWords;


}
