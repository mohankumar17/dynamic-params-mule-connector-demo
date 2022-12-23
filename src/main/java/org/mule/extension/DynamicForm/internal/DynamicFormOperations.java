package org.mule.extension.DynamicForm.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.util.Map;

import org.mule.runtime.extension.api.annotation.dsl.xml.ParameterDsl;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class DynamicFormOperations {

	@Parameter
	@DisplayName("Method")
	@ParameterDsl(allowReferences = false)
	private DynamicParameters method;

	@MediaType(value = ANY, strict = false)
	public Map<String, String> performRequests() {
		return method.getParams();
	}

}
