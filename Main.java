class Main {
    public static void main(String[] args) {
        VeiculoFactory factory1 = new carroFactory();
        VeiculoFactory factory2 = new motoFactory();

        Veiculo veiculo1 = factory1.criarVeiculo();
        Veiculo veiculo2 = factory2.criarVeiculo();

        veiculo1.acelerar();
        veiculo1.frear();

        veiculo2.acelerar();
        veiculo2.frear();
    }
}