package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer stock;

    public StockDecreased(Stock aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
