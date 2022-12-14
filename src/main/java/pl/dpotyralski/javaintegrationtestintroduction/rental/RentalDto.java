package pl.dpotyralski.javaintegrationtestintroduction.rental;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import pl.dpotyralski.javaintegrationtestintroduction.movie.MovieType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RentalDto {

    private Long id;

    private Long customerId;

    private Long movieId;

    private LocalDate rentDate;

    private LocalDate dueBy;

    private LocalDate returnedOn;

    private BigDecimal priceCalculated;

    private BigDecimal lateReturnCharge;

    @Enumerated(EnumType.STRING)
    private MovieType movieType;

}
