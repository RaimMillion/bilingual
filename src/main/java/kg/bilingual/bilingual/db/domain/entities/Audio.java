package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "audio_table")

@AllArgsConstructor
@NoArgsConstructor
public class Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "word")
    private String word;
//?
    @Column(name = "audio")
    private String audio;

    @Column(name = "isTrue")
    private boolean isTrue;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private ListenAndSelectRealEnglishWords listenAndSelectRealEnglishWords;


}
