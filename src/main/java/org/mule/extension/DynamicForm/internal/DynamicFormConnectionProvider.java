package org.mule.extension.DynamicForm.internal;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.connection.PoolingConnectionProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicFormConnectionProvider implements PoolingConnectionProvider<DynamicFormConnection> {

	private final Logger LOGGER = LoggerFactory.getLogger(DynamicFormConnectionProvider.class);

	@Override
	public DynamicFormConnection connect() throws ConnectionException {
		return new DynamicFormConnection();
	}

	@Override
	public void disconnect(DynamicFormConnection connection) {
		try {
			connection.invalidate();
		} catch (Exception e) {
			LOGGER.error("Error while disconnecting", e);
		}
	}

	@Override
	public ConnectionValidationResult validate(DynamicFormConnection connection) {
		return ConnectionValidationResult.success();
	}
}
