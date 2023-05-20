class motoFactory implements VeiculoFactory {
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}