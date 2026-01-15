public class Petshop {
    
    private boolean maquinaOcupada = false;

    private int nivelAgua = 0;

    private int nivelXampu = 0;

    public String darBanho() {
        limparMaquina();
        colocarPetNaMaquina();
        abastecerComAgua();
        abastecerComXampu();
        return "Pet está tomando banho";
    }

    public int abastecerComAgua() {
        this.nivelAgua = 30;
        return this.nivelAgua;
    }

    public int abastecerComXampu() {
        this.nivelXampu = 10;
        return this.nivelXampu;
    }

    public int verificarNivelAgua() {
        return this.nivelAgua;
    }

    public int verificarNivelXampu() {
        return this.nivelXampu;
    }

    public String colocarPetNaMaquina() {
        this.maquinaOcupada = true;
        return "Pet colocado na máquina, maquina agora está ocupada com um pet!";
    }

    public String retirarPetDaMaquina() {
        this.maquinaOcupada = false;
        return "Pet retirado da maquina, maquina agora está desocupada!";
    }

    public String limparMaquina() {
        this.nivelAgua = 0;
        this.nivelXampu = 0;
        return "Maquina agora está limpa!";
    }


    public boolean isMaquinaOcupada() {
        return maquinaOcupada;
    }

    public void setMaquinaOcupada(boolean maquinaOcupada) {
        this.maquinaOcupada = maquinaOcupada;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getNivelXampu() {
        return nivelXampu;
    }

    public void setNivelXampu(int nivelXampu) {
        this.nivelXampu = nivelXampu;
    }

}
