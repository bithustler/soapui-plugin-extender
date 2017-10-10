# SoapUI Plugin Extender

A basic stub to work around pesky engineering effort to make open source software useless so people fork out for the paid version.

1\. Build the [soapui-pluginloader-jailbreak](https://github.com/hschott/soapui-pluginloader-jailbreak) library.

2\. Drop the jailbreak jar into `$SOAPUI_HOME/bin/ext` __not__ into your JRE folder.

3.\ Build this stub library 

4\. Drop the stub jar into `$SOAPUI_HOME/lib` folder 

5.\ Build a SoapUI plugin like [soapui-groovy-console-plugin](https://github.com/olensmar/soapui-groovy-console-plugin)

6.\ Drop the plugin jar into the default `$HOME\.soapuios\plugins` folder

**_Et viola, belle vie ... you can now load custom plugins again!_**

Tested with SoapUI OpenSource 5.2.1 and 5.3.0
