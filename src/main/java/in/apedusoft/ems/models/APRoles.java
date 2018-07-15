package in.apedusoft.ems.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="roles")
public class APRoles {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	@Column(name="name", nullable=false)
	private String name;
	@NotEmpty
	@Column(name="desc", nullable=false)
	private String desc;
	@NotEmpty
	@Column(name="create_date", nullable=false)
	private Date createDate;
	@NotEmpty
	@Column(name="update_date", nullable=false)
	private Date updateDate;
	@NotEmpty
	@Column(name="is_active", nullable=false)
	private Boolean isActive;
	@NotEmpty
	@Column(name="is_deleted", nullable=false)
	private Boolean isDeteted;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
	private APUser user;
	
	public APRoles() {
		// TODO Auto-generated constructor stub
	}

	public APRoles(int id, String name, String desc, Date createDate, Date updateDate, Boolean isActive,
			Boolean isDeteted, APUser user) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.isActive = isActive;
		this.isDeteted = isDeteted;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeteted() {
		return isDeteted;
	}

	public void setIsDeteted(Boolean isDeteted) {
		this.isDeteted = isDeteted;
	}

	public APUser getUser() {
		return user;
	}

	public void setUser(APUser user) {
		this.user = user;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + id;
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((isDeteted == null) ? 0 : isDeteted.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		APRoles other = (APRoles) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (id != other.id)
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (isDeteted == null) {
			if (other.isDeteted != null)
				return false;
		} else if (!isDeteted.equals(other.isDeteted))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "APRoles [id=" + id + ", name=" + name + ", desc=" + desc + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", isActive=" + isActive + ", isDeteted=" + isDeteted + ", user="
				+ user + "]";
	}
	
	
	
}
