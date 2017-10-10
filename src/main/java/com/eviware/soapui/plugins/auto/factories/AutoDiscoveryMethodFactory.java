package com.eviware.soapui.plugins.auto.factories;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.plugins.auto.PluginDiscoveryMethod;
import com.eviware.soapui.plugins.oss.DiscoveryMethodFactory;
import com.eviware.soapui.support.action.SoapUIAction;

public class AutoDiscoveryMethodFactory extends SimpleSoapUIFactory<SoapUIAction> {

  public AutoDiscoveryMethodFactory(PluginDiscoveryMethod method, Class<SoapUIAction> actionType) {
    super(DiscoveryMethodFactory.class, actionType);
    SoapUI.log("No-op " + getClass().getName());
  }

}
