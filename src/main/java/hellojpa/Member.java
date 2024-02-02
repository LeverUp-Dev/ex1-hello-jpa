package hellojpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id
    private Long id;

    @Column(unique = true, length = 10)
    private String name;

    protected Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
