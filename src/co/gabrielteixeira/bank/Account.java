package co.gabrielteixeira.bank;

public class Account {
    private static final int MAX_LENGTH = 12;
    private String agencia;
    private String cc;
    private String name;
    private String lastName;
    private double saldo = 0;
    private Log logger;


    //Constructor
   public Account(String agencia, String cc, String name, String lastName){
       this.agencia = agencia;
       this.cc = cc;
       setName(name);
       setLastName(lastName);
       logger = new Log();
   }

   //Setters
   public void setName(String name){
       if (name.length() > MAX_LENGTH){
           this.name = name.substring(0, MAX_LENGTH);
       }else {
           this.name = name;
       }
   }

   public void setLastName(String lastName){
       if (lastName.length() > MAX_LENGTH){
           this.name = name.substring(0, MAX_LENGTH);
       } else {
           this.lastName = lastName;
       }
   }

   //Getters

    public String getFullName(){
       return name + " " +lastName;
    }

    //Métodos

    public void deposit(double value){ //Adiciona valores na conta
       saldo += value;
       logger.out("Depósito realizado com sucesso. Novo saldo: "+saldo);
    }

   public boolean withDraw(double value){ //Tira valores da conta
       if (saldo > value){
           saldo -= value;
           logger.out("Valor retirado: "+value+"| Novo saldo: "+saldo);
           return true;
       } else {
           logger.out("Não foi possivel realizar a operação, por favor verifique seu saldo e tente novamente!");
           return false;
       }


   }

   @Override
   public String toString(){
        //String result = "A conta "+this.name+" "+this.agencia+" / "+this.cc +" possui: R$"+saldo;
        //return result;  | Essas duas linhas se resume na linha abaixo
       return "A conta "+this.name+" "+this.agencia+" / "+this.cc +" possui: R$"+saldo;
   }

}
