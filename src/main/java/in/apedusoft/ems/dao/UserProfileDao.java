package in.apedusoft.ems.dao;


import java.util.List;

import in.apedusoft.ems.models.UserProfile;



public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
