package in.apedusoft.ems.services;


import java.util.List;

import in.apedusoft.ems.models.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
