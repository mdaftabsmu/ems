package in.apedusoft.ems.services;

import java.util.List;

import in.apedusoft.ems.models.APUser;



public interface UserService {
	
	APUser findById(int id);
	
	APUser findByUser(String userName);
	
	APUser findBySSO(String sso);
	
	void saveUser(APUser user);
	
	void updateUser(APUser user);
	
	void deleteUserBySSO(String sso);

	List<APUser> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}