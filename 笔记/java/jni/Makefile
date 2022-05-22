JAVA_HOME=C:\Program Files\Java\jdk1.8.0_301

all:libMain.dll

Main.class:Main.java
	javac $^

libMain.dll:Main.h Main.c
	gcc -I.\ "-I$(JAVA_HOME)\include" "-I$(JAVA_HOME)\include\win32" -Wl,--add-stdcall-alias -shared -m64 -o $@ $^

Main.h:Main.class
	@if exist $@ del $@
	javah -jni -classpath .\ -d .\ $(basename $^)
	
.PHONY:clean

clean:
	del *.class *.h *.dll
	
run:Main.class
	java -classpath .\ $(basename $^)
