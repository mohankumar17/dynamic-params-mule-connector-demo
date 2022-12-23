package org.mule.extension.DynamicForm.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@Operations(DynamicFormOperations.class)
@ConnectionProviders(DynamicFormConnectionProvider.class)
public class DynamicFormConfiguration {
}
