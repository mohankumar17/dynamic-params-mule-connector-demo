package org.mule.extension.DynamicForm.internal;

import java.util.HashMap;
import java.util.Map;

import org.mule.runtime.extension.api.annotation.Alias;

@Alias("GET")
public class GetAllParameters implements DynamicParameters {

	@Override
	public Map<String, String> getParams() {
		Map<String, String> mp = new HashMap<>();
		return mp;
	}
}
