
# Failure
```
git clone git@github.com:marko-asplund/blog-gists.git
cd blog-gists/macros-interop

git checkout macros-interop/fail

# compilation failure: "cannot find symbol"
sbt 'runMain com.practicingtechie.gist.macros.JavaClient'

# MyReusableService.macroMethod not defined in classfile
javap -c -cp target/scala-2.11/classes com.practicingtechie.gist.macros.MyReusableService$
```

# Success
```
git checkout master

# compiles and runs, but MyReusableService.macroMethod is not invoked
sbt 'runMain com.practicingtechie.gist.macros.JavaClient'

# MyReusableService.macroMethod is invoked
sbt 'runMain com.practicingtechie.gist.macros.ScalaClient'

# MyReusableService.macroMethod still not defined in classfile
javap -c -cp target/scala-2.11/classes com.practicingtechie.gist.macros.MyReusableService$
# macro definition expanded at call site
javap -c -cp target/scala-2.11/classes com.practicingtechie.gist.macros.ScalaClient$

```
