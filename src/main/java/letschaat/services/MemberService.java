package letschaat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import letschaat.dao.MemberDaoImpl;
import letschaat.model.register;

@Service
public class MemberService {

	@Autowired
	MemberDaoImpl memberdaoimpl;
	
	public int registernewMember(register mem)
	{
	int z=memberdaoimpl.registernewMember(mem);
	return z;
	}
}
