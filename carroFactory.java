class carroFactory implements VeiculoFactory {
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}