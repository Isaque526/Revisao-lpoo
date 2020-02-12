 
package principal;

 
public class Principal {

  
    public static void main(String[] args) {
        
        Paciente p = new Paciente();
        p.setNome("Delino");
        p.setRG("202.0490E02.");
        p.getcpf("2983.93783.");
        p.setCodPaciente("010203");
        p.setSenha (07); 
        
            
        System.out.println("Dados");
        System.out.println("paciente " + p.getNome);
   
    }
    
}


