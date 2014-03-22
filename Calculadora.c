#include <jni.h>
#include <stdio.h>
#include "Calculadora.h"

JNIEXPORT jdouble JNICALL 
Java_Calculadora_SumaC(JNIEnv *env, jobject obj, jdouble operador_1,  jdouble operador_2)
{
  return operador_1 + operador_2;
}


JNIEXPORT jdouble JNICALL 
Java_Calculadora_RestaC(JNIEnv *env, jobject obj, jdouble operador_1,  jdouble operador_2)
{
  return operador_1 - operador_2;
}


JNIEXPORT jdouble JNICALL 
Java_Calculadora_MultiplicacionC(JNIEnv *env, jobject obj, jdouble operador_1,  jdouble operador_2)
{
  return operador_1 * operador_2;
}


JNIEXPORT jdouble JNICALL 
Java_Calculadora_DivisionC(JNIEnv *env, jobject obj, jdouble operador_1,  jdouble operador_2)
{
  return operador_1 / operador_2;
}