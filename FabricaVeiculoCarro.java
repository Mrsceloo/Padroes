class MotoFactory implements VeiculoFactory {
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}