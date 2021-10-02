public class Pessoa {

    static int contador;
    public String nome;
    public int cpf;

    public Pessoa(String nome, int cpf, int qndEnd)
    {
        this.nome=nome;
        this.cpf=cpf;
        contador ++;
        qndEnd = contador;
    }

    public void addEndereco(Endereco end = new Endereco)
    {
        end.rua="Av. João de Camargo";
        end.bairro="Centro";
        end.num=510;
    }

    public void mostraInfo()
    {
        Endereco[] dados = new Endereco[10];
        for(int i =0; i<dados.length; i++)
        {
            if(dados[i]!=null){
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Rua: " + dados[i].rua);
                System.out.println("Número: " + dados[i].num);
                System.out.println("Bairro: " + dados[i].bairro);
            }
        }
    }
}
