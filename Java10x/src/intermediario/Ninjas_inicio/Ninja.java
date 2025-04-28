package intermediario.Ninjas_inicio;

public class Ninja {

        String Nome;
        int Idade;
        String Aldeia;
        boolean Vivo;

        public void Apresentar(){
                System.out.println("Me chamo: "+Nome +" tenho "+this.Idade+" anos.");
                System.out.println("Sou da "+this.Aldeia+" e eu estou vivo?: "+this.Vivo);
        }
}
