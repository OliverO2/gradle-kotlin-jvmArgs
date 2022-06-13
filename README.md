### Small Reproducer for [gradle#15239](https://github.com/gradle/gradle/issues/15239)

#### For a run task, a value of applicationDefaultJvmArgs is lost, if jvm argument with -javaagent is added via init script

To reproduce:
```shell
./gradlew run --quiet --init-script init.gradle.kts
```

#### Result
``` 
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[otel.javaagent 2022-06-13 17:12:51:074 +0200] [main] INFO io.opentelemetry.javaagent.tooling.VersionLogger - opentelemetry-javaagent - version: 1.12.1
expect: foo=value
actual: foo=null
FAIL
```

#### Versions
* Gradle 7.4.2
* JDK 11
