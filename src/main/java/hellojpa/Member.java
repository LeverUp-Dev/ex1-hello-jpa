package hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@TableGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = "MEMBER_SEQ", allocationSize = 1)
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

    @Column(name = "name", nullable = false)
    private String userName;

    public Member() {
    }

}
