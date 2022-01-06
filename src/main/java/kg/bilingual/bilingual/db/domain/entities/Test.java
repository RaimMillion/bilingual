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
    @Fetch(value = FetchMode.SUBSELECT)
    private List<SelectRealEnglishWords> selectRealEnglishWords = new ArrayList<>();

    //    link between ListenAndSelectRealEnglishWords and Test

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ListenAndSelectRealEnglishWords> listenAndSelectRealEnglishWords = new ArrayList<>();

    //    link between ListenAndType and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ListenAndType> listenAndTypes = new ArrayList<>();

    //    link between DescribePicture and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<DescribePicture> describePictures = new ArrayList<>();

    //    link between Record and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Record> records = new ArrayList<>();

    //    link between Essay and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Essay> essays = new ArrayList<>();


    //    link between Highlight and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Highlight> highlights = new ArrayList<>();

    //    link between MainIdea and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<MainIdea> mainIdeas = new ArrayList<>();

    //    link between Option and Test
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "test")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Option> options = new ArrayList<>();




    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

}
