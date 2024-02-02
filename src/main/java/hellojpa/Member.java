package hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter @Setter
public class Member {

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String userName;

    protected Member() {
    }

}
