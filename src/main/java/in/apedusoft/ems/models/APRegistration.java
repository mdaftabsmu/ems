package in.apedusoft.ems.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="registration")
public class APRegistration extends APBaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	@Column(name="name", nullable=false)
	private String name;
	
	@NotEmpty
	@Column(name="dob", nullable=false)
	private String dob;
	
	@NotEmpty
	@Column(name="mobile", nullable=false)
	private String mobile;
	
	@NotEmpty
	@Column(name="address", nullable=false)
	private String address;
	
	
	
	
	
	
	
	
	

}
