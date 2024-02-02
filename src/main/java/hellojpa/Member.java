package hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    protected Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    private Long id;
    private String name;
}
