package com.eviware.soapui.plugins.auto.factories;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.plugins.auto.PluginImportMethod;
import com.eviware.soapui.plugins.oss.ImportMethodFactory;
import com.eviware.soapui.support.action.SoapUIAction;

public class AutoImportMethodFactory extends SimpleSoapUIFactory<SoapUIAction> {

  private final String pluginName;

  public AutoImportMethodFactory(PluginImportMethod method, Class<SoapUIAction> actionType) {
    super(ImportMethodFactory.class, actionType);
    this.pluginName = method.label();
    SoapUI.log("No-op " + getClass().getName());
  }

}

