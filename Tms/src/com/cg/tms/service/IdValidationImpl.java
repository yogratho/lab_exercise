package com.cg.tms.service;

public class IdValidationImpl implements IIdValidation{

	@Override
	public boolean idValidation(String id) {
		int size=id.length();
		if(IIdValidation.ADMINID.length()==id.length())
			return true;
		else if((id.charAt(size-2)=='I') && (id.charAt(size-1)=='N'))
			return true;
		else if(Integer.parseInt(id)<0)
			return false;
		
		else
		return false;
		
	}

	
}
