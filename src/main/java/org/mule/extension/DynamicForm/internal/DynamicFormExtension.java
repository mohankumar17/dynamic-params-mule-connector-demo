package org.mule.extension.DynamicForm.internal;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.SubTypeMapping;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

@Xml(prefix = "dynamicform")
@Extension(name = "DynamicForm")
@Configurations(DynamicFormConfiguration.class)
@SubTypeMapping(baseType = DynamicParameters.class, subTypes = { GetByIDParameters.class,
		PostParameters.class, PutParameters.class, DeleteParameters.class })
public class DynamicFormExtension {

}
