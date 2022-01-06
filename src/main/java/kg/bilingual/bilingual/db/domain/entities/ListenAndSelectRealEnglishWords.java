package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "listen_select_words")
@AllArgsConstructor
@NoArgsConstructor
public class ListenAndSelectRealEnglishWords {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private int duration;

    //связь между таблицами Test и ListenAndSelectRealEnglishWords
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn
    private Test  test;

    // связь между таблицами Audio и ListenAndSelectRealEnglishWords
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "listenAndSelectRealEnglishWords")
    private List<Audio> audioList = new ArrayList<>();

}
