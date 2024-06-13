package net.trung.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seasons")
public class Season {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "location")
	private String location;
	
	public Season() {
		
	}
	
	public Season(String name, String time, String location) {
		super();
		this.name = name;
		this.time = time;
		this.location = location;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
