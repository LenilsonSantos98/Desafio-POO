//classe filha
public class Curso  extends Conteudo{
    //atributos
    
    private int cargaHoraria;
    
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
                + getDescricao() + "]";
    }
    
    

    
}
