public class ClasseEleitoral
{
    public static void main(String[] args){
        int idade = 20;
        if (idade < 16){
            System.out.println("Você não pode votar por ser menor que 16.");
        } else if (idade == 16 || idade == 17 || idade >= 65){
            System.out.println("Você pode votar, porém não é obrigatório.");
        }
        else if (idade >= 18 && idade < 65){
            System.out.println("Você pode votar. Seu voto é obrigatório.");
        }
    }
}
