package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
    //Collection은 필드에서 바로 생성 후 초기화 하는게 안전하다.
    //Collection을 가급적 변경하지말고 그냥 객체 생성할때 딱 두고 절대 바꾸지 말아야함.

}
