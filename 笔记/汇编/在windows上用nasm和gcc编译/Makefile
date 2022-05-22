all:main.exe

main.exe:main.obj
	gcc -m64 -o $@ $^

main.obj:main.asm
	nasm -f win64 $^
	
.PHONY:clean

clean:
	del *.exe *.obj