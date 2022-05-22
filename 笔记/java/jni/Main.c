#include "Main.h"
JNIEXPORT jint JNICALL Java_Main_add
  (JNIEnv *env, jclass obj, jint a, jint b){
	  return a+b;
  }
