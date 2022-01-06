package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "selectRealEnglishWords_table")
@AllArgsConstructor
@NoArgsConstructor
public class SelectRealEnglishWords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;

//связь между таблицами Test и SelectRealEnglishWords
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private Test test;

// связь между таблицами Word и SelectRealEnglishWords
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,
            mappedBy = "selectRealEnglishWords")
    private List<Word> words = new ArrayList<>();


}
