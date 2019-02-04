package ua.bondarenkojek.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "developer")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "salary")
    private double salary;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="developer_project",
            joinColumns=@JoinColumn(name="developer_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="project_id", referencedColumnName="id"))
    private Set<Project> projects;

    @OneToMany(mappedBy = "developer", cascade = CascadeType.ALL)
    private Set<Skill> skills;

    public void addSkill(Skill skill) {
        skill.setDeveloper(this);
        skills.add(skill);
    }

    public void addProject(Project project) {
        projects.add(project);
    }
}
