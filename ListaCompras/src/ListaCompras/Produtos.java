

package ListaCompras;


public class Produtos {
    String nome;
    String quantidade;
    String preco;
    Double precoConvertido;
    Double total=0.0;
    Double somaTotal=0.0;
    int[] ReceberValorTabela= new int[10];
    
   
    
    Integer quantidadeConvertido;
  
public void Somar (){
    quantidadeConvertido=Integer.parseInt(quantidade);
    precoConvertido = Double.parseDouble(preco);
    
 
       total=quantidadeConvertido*precoConvertido;
       somaTotal+=total;
}
public void ImprimirLista(){
    System.out.println("Dados Tabela"+ ReceberValorTabela);    
}


   
    
}
