package letschaat.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import letschaat.model.register;

public class MemberDaoImpl implements IMemberDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	public int registernewMember(register mem)
	{
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(mem);
		trans.commit();
		return 1;
		
	}
}
