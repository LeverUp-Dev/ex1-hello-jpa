package hellojpa;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Getter @Setter
public class Period {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    protected Period() {}

    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
