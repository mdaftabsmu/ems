package in.apedusoft.ems.dao;


import java.util.List;

import in.apedusoft.ems.models.APUser;



public interface UserDao {

	APUser findById(int id);
	
	APUser findByUserName(String userName);
	
	APUser findBySSO(String sso);
	
	void save(APUser APUser);
	
	void deleteBySSO(String sso);
	
	List<APUser> findAllUsers();

}

