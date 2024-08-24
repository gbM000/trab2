package view;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.*;
import controller.Controller;
import java.time.Month;
import java.util.Scanner;

/**
 * usar composite para tratar as operações crud de func, pecas e serviços
 * 
 * usar o metodo builder para criar serviços
 * 
 * @author gabe
 */




public class Main {

    public static void main(String[] args) {
        Controller ctr = new Controller();
        Scanner sc = new Scanner(System.in);
        String op;
        
        ctr.CadastrarCliente(9999, "João Manuel", "jmanuel@email.com", "(22)99999-9999", new Endereco("Campos Novos","Bela Vista","Rio das Ostras","RJ","Brasil",1258));
        ctr.CadastrarCliente(7474, "Carlos", "carlos@email.com", "(22)98888-8888", new Endereco("Avenida 12","Praiamar","Rio das Ostras","RJ","Brasil",7452));
        
        ctr.CadastrarFuncionario(6532, 2035.75, 4231, "Luiza", "luiza@email.com", "(22)89657-5253", new Endereco("Campos Novos","Bela Vista","Rio das Ostras","RJ","Brasil",201));
        ctr.CadastrarFuncionario(5000, 2035.75, 1323, "Jhones", "jhjh@email.com", "(22)99887-7445", new Endereco("Nova Iguaçu","Mariléia","Rio das Ostras","RJ","Brasil",80));
        ctr.CadastrarFuncionario(4520, 3035.75, 7424, "Cláudia", "craudi@email.com", "(22)9952-6245", new Endereco("Rua 11","Nova Esperança","Rio das Ostras","RJ","Brasil",80));
        
        ctr.CadastrarPeca(11, "Estação de Solda", 2540.19, 100);
        ctr.CadastrarPeca(22, "Pincel", 35.12, 50);
        ctr.CadastrarPeca(33, "Mini Aspirador de Pó", 350.29, 70);
        ctr.CadastrarPeca(11, "Chave de Fenda", 359.90, 50);
        
        List<Funcionario> lf = new ArrayList(); lf.add(ctr.getFuncionario(6532)); lf.add(ctr.getFuncionario(5000));
        Map<Integer,Integer> mp = new HashMap(); mp.put(11,1);mp.put(22,4);
        
        ctr.AgendarServico(50,lf,mp);
        
        lf.clear(); lf.add(ctr.getFuncionario(4520));
        ctr.AgendarServico(88,lf,mp,LocalDate.of(2024,11,11));
        ctr.realizarServico(88);
        
        /*
        do{
            System.out.println("Escolha alguma opção: \n"
                    + "[1] Cadastrar Funcionario\n"
                    + "[2] Cadastrar Peça\n"
                    + "[3] Cadastrar Cliente\n"
                    + "[4] Cadastrar Empresa\n"
                    + "[5] Agendar Serviço\n"
                    + "[6] Realizar Serviço\n"
                    + "[7] Atualizar Funcionario\n"
                    + "[8] Atualizar Peça\n"
                    + "[9] Atualizar Cliente\n"
                    + "[10] Atualizar Empresa\n"
                    + "[11] Atualizar Serviço\n"
                    + "[12] Remover Funcionario\n"
                    + "[13] Remover Peça\n"
                    + "[14] Remover Cliente\n"
                    + "[15] Remover Empresa\n"
                    + "[16] Remover Serviço\n"
                    + "[17] Sair\n\n"
                    + "Digite: ");
            op = sc.next();
            switch(op){
                case "1": {
                    
                    System.out.print("Digite a matricula: ");
                    int matricula = sc.nextInt();
                    System.out.print("Digite o salario: R$ "); 
                    double salario = sc.nextDouble();
                    System.out.print("Digite o CPF: ");
                    int CPF = sc.nextInt();
                    System.out.print("Digite o nome do funcionario: ");
                    String nome = sc.next();
                    System.out.print("Digite o email do funcionario: ");
                    String email = sc.next();
                    System.out.print("Digite o telefone do funcionario"); 
                    String telefone = sc.next();
                    
                    System.out.println("\nSobre o endereço");
                    System.out.print("Digite o nome da rua: ");
                    String rua = sc.next();
                    System.out.print("Digite o nome do bairro: ");
                    String bairro = sc.next();
                    System.out.print("Digite o nome da cidade: ");
                    String cidade = sc.next();
                    System.out.print("Digite o nome do estado: "); 
                    String estado = sc.next();
                    System.out.print("Digite do país: ");
                    String pais = sc.next();
                    System.out.print("Digite o número: ");
                    int numero =  sc.nextInt();
                    Endereco endereco = new Endereco(rua,bairro,cidade,estado,pais,numero);
                    
                    ctr.CadastrarFuncionario(matricula, salario, CPF, nome, email, telefone, endereco);
                } break;
                case "2":{
                    System.out.print("Digite o código da peça: ");
                    int codigo = sc.nextInt(); 
                    System.out.print("Digite o nome da peça: ");
                    String nome = sc.next();
                    System.out.print("Digite o preço da peça: ");
                    double preco = sc.nextDouble();
                    System.out.print("Digite o custo da peça: ");
                    double custo = sc.nextDouble();
                } break;
                case "3":{
                    
                    System.out.print("Digite o CPF do cliente: ");
                    int CPF = sc.nextInt();
                    System.out.print("Digite o nome do cliente: ");
                    String nome = sc.next();
                    System.out.print("Digite o email do cliente: ");
                    String email = sc.next();
                    System.out.print("Digite o telefone do cliente"); 
                    String telefone = sc.next();
                    
                    System.out.println("\nSobre o endereço");
                    System.out.print("Digite o nome da rua: ");
                    String rua = sc.next();
                    System.out.print("Digite o nome do bairro: ");
                    String bairro = sc.next();
                    System.out.print("Digite o nome da cidade: ");
                    String cidade = sc.next();
                    System.out.print("Digite o nome do estado: "); 
                    String estado = sc.next();
                    System.out.print("Digite do país: ");
                    String pais = sc.next();
                    System.out.print("Digite o número: ");
                    int numero =  sc.nextInt();
                    Endereco endereco = new Endereco(rua,bairro,cidade,estado,pais,numero);
                    
                    ctr.CadastrarCliente(CPF, nome, email, telefone, endereco);
                } break;
                case "4":{
                    System.out.print("Digite o CNPJ da empresa: ");
                    int CNPJ = sc.nextInt();
                    System.out.print("Digite o nome da empresa: ");
                    String nome = sc.next();
                    System.out.print("Digite o email da empresa: ");
                    String email = sc.next();
                    System.out.print("Digite o telefone da empresa"); 
                    String telefone = sc.next();
                    
                    System.out.println("\nSobre o endereço");
                    System.out.print("Digite o nome da rua: ");
                    String rua = sc.next();
                    System.out.print("Digite o nome do bairro: ");
                    String bairro = sc.next();
                    System.out.print("Digite o nome da cidade: ");
                    String cidade = sc.next();
                    System.out.print("Digite o nome do estado: "); 
                    String estado = sc.next();
                    System.out.print("Digite do país: ");
                    String pais = sc.next();
                    System.out.print("Digite o número: ");
                    int numero =  sc.nextInt();
                    Endereco endereco = new Endereco(rua,bairro,cidade,estado,pais,numero);
                    
                    ctr.CadastrarEmpresa(CNPJ, estado, nome, email, telefone, endereco);
                }break;
                case"5":{
                    System.out.print("Digite o código do serviço: ");
                    int codigo = sc.nextInt();
                    int op2;
                    System.out.print("Deseja adicionar funcionarios?  [1] Sim  [2] Não \nDigite: ");
                    op2 = sc.nextInt();
                    List<Funcionario> f = new ArrayList();
                    while(op2 == 1){
                        System.out.print("Digite a matricula: ");
                        int matricula = sc.nextInt();
                        Funcionario funcionario = ctr.getFuncionario(matricula);
                        if(funcionario != null){
                            f.add(funcionario);
                        }
                        System.out.print("Continuar adicionando? [1] Sim");
                        op2 = sc.nextInt();
                    }
                    
                    System.out.print("Deseja adicionar peças?  [1] Sim  [2] Não \nDigite: ");
                    op2 = sc.nextInt();
                    Map<Integer,Integer> p = new HashMap();
                    while(op2 == 1){
                        System.out.print("Digite o código da peça: ");
                        int cod = sc.nextInt();
                        Peca peca = ctr.getPeca(cod);
                        System.out.print("Digite a quantidade da peça: ");
                        int qtd = sc.nextInt();
                        if(peca != null){
                            p.put(peca.getCodigo(),qtd);
                        }
                        System.out.print("Continuar adicionando? [1] Sim");
                        op2 = sc.nextInt();   
                    }
                    
                    if(!p.isEmpty() && !f.isEmpty()){
                        System.out.print("Digite uma data: ");
                        System.out.print("Dia: ");
                        int dia = sc.nextInt();
                        System.out.print("Mês: ");
                        int mes = sc.nextInt();
                        System.out.print("Ano: ");
                        int ano = sc.nextInt();
                        ctr.AgendarServico(codigo, f, p, LocalDate.of(ano,mes,dia));
                    }else{
                        ctr.AgendarServico(codigo, f, p);
                    }
                } break;
                case"6":{
                    System.out.print("Digite o código do serviço a ser realizado: ");
                    int cod = sc.nextInt();
                    ctr.realizarServico(cod);
                }
            }
            ctr.Imprimir();
        }while(!op.equals("17"));
        */
   }
}














/*
Endereco e1 = new Endereco("Cedros","Praiamar","Rio das Ostras","Rio de Janeiro","Brasil",123);
        Endereco e2 = new Endereco("Nueva Cidad","Bueno Center","Bueno Aires","Vacosa","Argentina",123);    
        Funcionario f1 = new Funcionario(5012,1500.75,741852,"Marcos Paulo","marcos@email.com","(22)99945-7812",e1); 
        Funcionario f2 = new Funcionario(4051,7500.75,880044,"Ana Castro","castroana@email.com","(31)98745-4125",e2);
        Peca p1 = new Peca(111,"Martelo",12.54,1.54);
        Peca p2 = new Peca(222,"Parafusadeira",105.44,2.03);
        LocalDate data = LocalDate.now();
        List<Funcionario> lf = new ArrayList<>();
        lf.add(f1); lf.add(f2);
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(p1.getCodigo(),12);
        mp.put(p2.getCodigo(), 2);
        ServicoBuilder s3 = new ServicoBuilder(2);
        s3.setFuncionario(lf);
        s3.setData(data);
        ServicoBuilder s2 = new ServicoBuilder(1);
        s2.setFuncionario(lf);
        s2.setPeca(mp);
        s2.setData(data);
        
        //s1.Montar(lf);
        //s2.Montar(data, mp, lf);
        
        Servico serv1 = s3.getResult();
        Servico serv2 = s2.getResult();
        
        System.out.println(serv1);
        System.out.println(serv2);
        
        System.out.println(data);
        LocalDate data2 = LocalDate.of(2000, 3, 21);
        LocalDate data3 = data2;
        System.out.println(data3);
*/