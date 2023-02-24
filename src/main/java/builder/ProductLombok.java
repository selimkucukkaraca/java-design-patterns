package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class ProductLombok {
    private Long id;
    private String name;
    private LocalDateTime dateTime;
    private Boolean inStock;
    private String description;
    private BigDecimal price;
}
