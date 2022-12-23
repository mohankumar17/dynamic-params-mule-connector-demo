package org.mule.extension.DynamicForm.internal;

import java.util.HashMap;
import java.util.Map;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Alias("POST")
public class PostParameters implements DynamicParameters {
	@Parameter
	@DisplayName("Payload")
	private String payload;

	public String getPayload() {
		return payload;
	}

	@Override
	public Map<String, String> getParams() {
		Map<String, String> mp = new HashMap<>();
		mp.put("payload", payload);
		return mp;
	}

}
