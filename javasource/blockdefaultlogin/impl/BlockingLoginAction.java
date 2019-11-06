package blockdefaultlogin.impl;

import java.util.Map;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.AuthenticationRuntimeException;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.UserAction;

import blockdefaultlogin.actions.BlockDefaultLogin;

public class BlockingLoginAction extends UserAction<Object> {
	
	private static ILogNode LOGGER = Core.getLogger(BlockDefaultLogin.class.getSimpleName());
	
	public BlockingLoginAction( Map<String, ? extends Object> params) {
		super(Core.createSystemContext());
	}
	
	@Override
	public ISession executeAction() throws Exception {
		LOGGER.warn("An unauthorized login attempt was made.");
		throw new AuthenticationRuntimeException(this.getClass().getSimpleName() + " FAILED: Unauthorized attempt to login.");
	}
}