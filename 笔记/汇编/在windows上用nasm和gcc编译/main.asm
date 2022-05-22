section .text
	global main ;64位 nasm -f win64 & gcc -m64
	global _main ;32位 nasm -f win32 & gcc -m32
	
main:
	ret
	
_main:
	ret