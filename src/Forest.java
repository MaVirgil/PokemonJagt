public class Forest extends Location {

    @Override
    public void showAllPokemon() {
        System.out.println("Pokemon i skoven");
        for (Pokemon p : this.pokemonList) {
            System.out.println(p);
        }
    }
}
