package examples.service.impl;

import examples.form.LoginForm;
import examples.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public Boolean valid(LoginForm login) {
		// TODO Auto-generated method stub
		
		return login !=null && login.getPassword().equals(login.getUsername());
	}

}
