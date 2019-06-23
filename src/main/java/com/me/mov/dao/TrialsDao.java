package com.me.mov.dao;

import javax.persistence.Query;



import com.me.mov.pojo.Login;

public class TrialsDao extends Dao {
	
	public String addData(Login login) throws Exception {
		String idn ;
		begin();

	//	Query query = getSession().createQuery("update Login set global_innodb_large_prefix = 'on'");
		//Login login1 = new Login("rose","man");
		idn =  (String)getSession().save(login);
		
		commit();
		close();
		rollback();
		return idn;
	}
	

}
