- Calculadora Basica creada en Java, utilizando JNI para llamar metodos nativos del Lenguaje C

Para el curso de Aplicaciones Moviles
ITCR - I Semestre 2014


- Para complilar correctamente las clases yo utilice los siguientes comandos.
  1. javac Calculadora.java 
  2. javah -jni Calculadora
  3. cc -fPIC -shared -I/usr/lib/jvm/java-7-openjdk-amd64/include -I/usr/lib/jvm/java-7-openjdk-amd64/include/linux -o libCalculadora.so Calculadora.c
  4. export LD_LIBRARY_PATH=.

- Notas
  1. Compila la clase Calculadora.java, genera Calculadora.class
  2. Crea el header Calculadora.h
  3. Crea el ejecutable libCalculadora.so y compila el la clase Calculadora.c
  4. Exporta la libreria creada 

By Jorge Chavarria Rodriguez
   201066559