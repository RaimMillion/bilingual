package kg.bilingual.bilingual.db.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "idea_table")

@AllArgsConstructor
@NoArgsConstructor
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "idea")
    private String idea;


    @Column(name = "checkBox")
    private boolean checkBox;

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private MainIdea MainIdea;


}
