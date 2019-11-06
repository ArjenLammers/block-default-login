package blockdefaultlogin.impl;

import com.mendix.core.action.user.LoginAction;
import com.mendix.systemwideinterfaces.core.UserActionListener;

public class BlockingLoginActionListener extends UserActionListener<LoginAction> {
	
	public BlockingLoginActionListener() {
		super(LoginAction.class);
	}
	
	@Override
	public boolean check(LoginAction action) {
		return true;
	}
}
