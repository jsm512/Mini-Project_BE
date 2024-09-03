package kr.co.ureca.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Long userId;

    @JoinColumn(name = "seatid")
    @OneToOne
    private Seat seat;

    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "password")
    private String password;

    @Column(name = "hasreservation")
    private Boolean hasReservation;
}
