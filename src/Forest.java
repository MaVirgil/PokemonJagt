public class Forest extends location{

    @Override
    public void showAllPokemon() {
        System.out.println("Pokemon i skoven");
        for (Pokemon p : pokemonList) {
            System.out.println(p);
        }
    }
}
