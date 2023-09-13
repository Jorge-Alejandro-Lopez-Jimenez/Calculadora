package Calculadora;

public class Unidades {
   /* 3 métodos */ 
      public int metrosapulgadas (float valor,int caso ){
      if (caso==1){
      float resultado = valor * 39.37f;
      return resultado;//rsultado en pulgadas
      }
      else {
         float resultado = valor / 39.37f;
         return resultado;//resultado en metros
}
   }

public int metrosayardas (float valor,int caso){//se evalua una variable entera para determinar el caso
if(caso==1){
   float resultado = valor * 1.09361f; // Relación de conversión de metros a yardas
    return resultado;//resultado en yardas
}
else {
   float resultado = valor / 1.09361f; // Relación de conversión de yardas a metros
    return resultado;//resultado en metros
}
}

public int metrosamillas (float valor, int caso){
   if(caso==1){
      float resultado = valor * 0.000621371f; // Relación de conversión de metros a millas
      return resultado;//resultado en millas
   }
   else {
      float resultado = valor / 0.000621371f; // Relación de conversión de millas a metros
      return resultado;//resultado en metros
   }
}
}
