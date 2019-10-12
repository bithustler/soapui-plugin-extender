# SoapUI Plugin Extender

A basic stub to work around pesky engineering effort to make open source software useless so people fork out for the paid version.

1. Install the [`soapui-pluginloader-jailbreak`](https://github.com/bithustler/soapui-pluginloader-jailbreak) library as documented

2. Download the [`soapui-plugin-extender-5.5.0.jar`](https://github.com/bithustler/soapui-plugin-extender/releases/download/v5.5.0/soapui-plugin-extender-5.5.0.jar)

4. Drop the `soapui-plugin-extender` jar into `$SOAPUI_HOME/lib` folder

5. Build a SoapUI plugin like [soapui-groovy-console-plugin](https://github.com/olensmar/soapui-groovy-console-plugin)

6. Drop the plugin jar into the default `$HOME\.soapuios\plugins` folder

  **_Et viola, belle vie ... you can now load custom plugins again!_**

Tested with SoapUI OpenSource 5.2.1 to 5.5.0
