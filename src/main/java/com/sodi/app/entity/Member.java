package com.sodi.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "member_id")
    @Column(name = "member_id", unique = true, nullable = false)
	private Long id;

	@Column(length = 15, nullable = false)
	private String name;

	@Column(length = 100, nullable = false)
	private String password;

	@Column(length = 50, nullable = false)
	private String email;

	@OneToMany(mappedBy = "member", cascade = CascadeType.MERGE, orphanRemoval = true)
	private List<Board> board = new ArrayList<>();

	@Column(length = 20, nullable = false)
	private String contact;

	@Builder
	public Member(String name, String password, String email, String contact) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

}
