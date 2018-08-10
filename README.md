With ```fork := false``` the following works:

```
sbt -Dconfig.file=alternative.conf "runMain com.test.Main"
```

With ```fork := true``` the following works:

```
sbt '; set javaOptions += "-Dconfig.file=alternative.conf" ; runMain com.test.Main'
```
