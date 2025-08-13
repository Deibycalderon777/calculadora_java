public class Calculadora {
   Double total;
        
        public Double suma(Double primerN ,Double segundoN){ 
        return total=primerN+segundoN;        

        }
        public Double resta(Double primerN ,Double segundoN){
        return total=primerN-segundoN;        
     
        }
        public Double multiplicacion( Double primerN ,Double segundoN ){
         return total=primerN*segundoN;        

     
            
        }
        public Double divicion(Double primerN , Double segundoN){
         // antes de retornar el valor de total de la divicion comprobamos que segundoN no sea cero
           // si, sies un 0 imprimimos en pantalla y no retornamos nada  
        if (segundoN == 0) {
            System.out.print("Error: Division por cero no permitida.");
            return null;
        }
        return total = primerN / segundoN;
    }


 }// fin clase Calculadora
