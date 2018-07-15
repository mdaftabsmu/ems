package in.apedusoft.ems.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.apedusoft.ems.dao.UserDao;
import in.apedusoft.ems.models.APUser;
import in.apedusoft.ems.services.UserService;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public APUser findById(int id) {
		return dao.findById(id);
	}

	public APUser findBySSO(String sso) {
		APUser user = dao.findBySSO(sso);
		return user;
	}

	public void saveUser(APUser user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		dao.save(user);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateUser(APUser user) {
		APUser entity = dao.findById(user.getId());
		if(entity!=null){
			if(!user.getPassword().equals(entity.getPassword())){
				entity.setPassword(passwordEncoder.encode(user.getPassword()));
			}
			entity.setEmail(user.getEmail());
			entity.setUserProfiles(user.getUserProfiles());
		}
	}

	
	public void deleteUserBySSO(String sso) {
		dao.deleteBySSO(sso);
	}

	public List<APUser> findAllUsers() {
		return dao.findAllUsers();
	}

	public boolean isUserSSOUnique(Integer id, String sso) {
		APUser user = findBySSO(sso);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}

	@Override
	public APUser findByUser(String userName) {
		// TODO Auto-generated method stub
		return dao.findByUserName(userName);
	}
	
}
