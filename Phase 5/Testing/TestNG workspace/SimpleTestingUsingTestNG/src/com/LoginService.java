package com;

public class LoginService {

	public String checkUser(String uname, String pass) {
		if(uname.equals("Raj") && pass.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
