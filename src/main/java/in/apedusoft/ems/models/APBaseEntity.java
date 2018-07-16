package src.main.java.in.apedusoft.ems.models;

@MappedSuperclass
public class APBaseEntity implements Serializable {
	
	private Date createDate;
	private Integer createBy;
	private Date modifyDate;
	private Integer modifyBy;
	private Boolean isActive;
	private Boolean isDelelet;
	
	public APBaseEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
