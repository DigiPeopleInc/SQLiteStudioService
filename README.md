# SQLiteStudioService
Tool for remote connection to database using [SQLiteStudio](https://sqlitestudio.pl/index.rvt).
Wrapper around [fork](https://github.com/sirbralex/sqlitestudio-android) of [original library](https://github.com/pawelsalawa/sqlitestudio-android)

SQLiteStudio plugin description is availble [here](https://github.com/pawelsalawa/sqlitestudio/wiki/DbAndroid)

Usage
--------
```java
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new SQLiteStudioService(this, 12121).start();
    }
}
```

Download
------------
###### Common usage
```groovy
dependencies {
    implementation 'ru.digipeople.database:sqlitestudioservice:1.0.0'
}
```
###### Stub implementation for relese build
```groovy
dependencies {
    debugImplementation 'ru.digipeople.database:sqlitestudioservice:1.0.0'
    releaseImplementation 'ru.digipeople.database:sqlitestudioservice-stub:1.0.0'
}
```