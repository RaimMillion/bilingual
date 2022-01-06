package kg.bilingual.bilingual.db.domain.entities;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "test_table")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_of_Test")
    private String nameOfTest;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "duration")
    private int duration;

    @Column(name = "active")
    private boolean active;

    //    link between SelectRealEnglishWords and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    private List<SelectRealEnglishWords> selectRealEnglishWords = new ArrayList<>();

    //    link between ListenAndSelectRealEnglishWords and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    private List<ListenAndSelectRealEnglishWords> listenAndSelectRealEnglishWords = new ArrayList<>();





    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

}
