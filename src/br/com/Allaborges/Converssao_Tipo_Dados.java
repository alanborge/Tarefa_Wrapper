package br.com.Allaborges;

/**
 * classe converte tipo de dados
 */
public class Converssao_Tipo_Dados {
   /**
    * unboxing
    */
   private short tipo_primitivo;
   private Integer validacao = Integer.valueOf(tipo_primitivo);
   private Long numI = Long.valueOf(validacao);

   public Long getNumI() {
      return numI;
   }

   public void setNumI(Long numI) {
      this.numI = numI;
   }

   public short getTipo_primitivo() {
      return tipo_primitivo;
   }

   public void setTipo_primitivo(short tipo_primitivo) {
      this.tipo_primitivo = tipo_primitivo;
   }

   public Integer getValidacao() {
      return validacao;
   }

   public void setValidacao(Integer validacao) {
      this.validacao = validacao;
   }

   public void impressaoDiretaConversao(){
   System.out.println("\n" + "casting dados de primitivo para Wrapper" + "\n");
      setNumI(1111111254999999999l);
      getNumI();
      System.out.println(getNumI());
      System.out.println("---------Nova Validação------------------");
      short tipo_primitivo2 = 9999;
      Long novaConvercao = Long.valueOf(tipo_primitivo2);
      System.out.println(tipo_primitivo2);
      System.out.println(novaConvercao);


   }
}
