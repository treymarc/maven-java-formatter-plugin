maven-java-formatter-plugin
===========================

fork from http://code.google.com/p/maven-java-formatter-plugin


ver 0.4-SNAPSHOT
======================
- accept new configuration options : verboseOutput will output full file names by default



ver 0.3 (2011-03-01)
======================
- accept new configuration options: includes, excludes, encoding
- removed configuration option: directories
- uses specific Eclipse dependency versions to avoid checking for updates

ver 0.1.0 (2010-07-07)
======================
- accept following configuration options: directories, compilerSource, compilerCompliance, compilerTargetPlatform, configFile (eclipse formatter configuration file)

ver 0.2.0 (2010-09-28)
======================
- accept new configuration options: lineEnding, overrideConfigCompilerVersion, configFile (from dependency classpath, fail if invalid)
- use Eclipse 3.5 code formatter
- use process-sources phase
- use googlecode groupId
- provide Maven site 
- available from Maven central repository
