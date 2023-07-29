package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    // Ordinal로 쓰면 int로 받음, 순서가 뒤바뀔 수 있기 때문에 꼭 String으로 할것.
    private DeliveryStatus status;
}
