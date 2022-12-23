package org.mule.extension.DynamicForm.internal;

import java.util.HashMap;
import java.util.Map;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Alias("GET-BY-ID")
public class GetByIDParameters implements DynamicParameters {
	@Parameter
	@DisplayName("ID")
	private String id;

	public String getId() {
		return id;
	}

	@Override
	public Map<String, String> getParams() {
		Map<String, String> mp = new HashMap<>();
		mp.put("id", id);
		return mp;
	}

}
