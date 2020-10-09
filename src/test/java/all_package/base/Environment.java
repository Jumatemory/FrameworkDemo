package all_package.base;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:application.properties" // mention the property file name
})
public interface Environment extends Config {
    String env1();
    String env2();
    String env3();
    String username();

    String password();

    @Key("db.hostname")
    String getDBHostname();

    @Key("db.port")
    int getDBPort();

    @Key("db.username")
    String getDBUsername();

    @Key("db.password")
    String getDBPassword();
}
