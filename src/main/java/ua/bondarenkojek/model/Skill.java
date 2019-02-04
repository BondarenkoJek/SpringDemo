package ua.bondarenkojek.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@EqualsAndHashCode(exclude = "developer")
@ToString(exclude = "developer")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @Column(name = "level")
    @Enumerated(value = EnumType.STRING)
    private Level level;

    @ManyToOne
    @JoinColumn(name = "developer_id")
    private Developer developer;

    public enum Type {
        JAVA,
        CPP,
        C_SHARP,
        JS
    }

    public enum Level {
        JUNIOR,
        MIDDLE,
        SENIOR
    }
}
